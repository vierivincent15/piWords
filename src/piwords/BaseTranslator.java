package piwords;

public class BaseTranslator {
    /**
     * Converts an array where the ith digit corresponds to (1 / baseA)^(i + 1)
     * digits[i], return an array output of size precisionB where the ith digit
     * corresponds to (1 / baseB)^(i + 1) * output[i].
     * 
     * Stated in another way, digits is the fractional part of a number
     * expressed in baseA with the most significant digit first. The output is
     * the same number expressed in baseB with the most significant digit first.
     * 
     * To implement, logically, you're repeatedly multiplying the number by
     * baseB and chopping off the most significant digit at each iteration:
     * 
     * for (i < precisionB) {
     *   1. Keep a carry, initialize to 0.
     *   2. From RIGHT to LEFT
     *   	a. x = multiply the jth digit by baseB and add the carry
     *          b. the new jth digit is x % baseA
     *          c. carry = x / baseA
     *   3. output[i] = carry
     * }
     * If digits[j] < 0 or digits[j] >= baseA for any j, return null
     * If baseA < 2, baseB < 2, or precisionB < 1, return null
     * 
     * @param digits The input array to translate. This array is not mutated.
     * @param baseA The base that the input array is expressed in.
     * @param baseB The base to translate into.
     * @param precisionB The number of digits of precision the output should
     *                   have.
     * @return An array of size precisionB expressing digits in baseB.
     */
    public static int[] convertBase(int[] digits, int baseA, int baseB, int precisionB) {
        // TODO: Implement (Problem c)
        if(baseA < 2 || baseB < 2 || precisionB < 1) return null;
        int[] convert_array = new int[precisionB];
        int[] digits2 = new int[digits.length];

        for(int c=0; c<digits.length; c++){
            if(digits[c] < 0 || digits[c] >= baseA) return null;
            digits2[c] = digits[c];
        }

        for(int i=0; i<precisionB; i++){
            int carry = 0;
            for(int j=(digits.length)-1; j>=0; j--){
                int x = digits2[j]*baseB + carry;
                digits2[j] = x%baseA;
                carry = x / baseA;
            }
            convert_array[i] = carry;

                }
        return convert_array;
    }
}
