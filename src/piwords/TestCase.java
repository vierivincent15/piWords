package piwords;

import java.util.Arrays;

public class TestCase {
    public static void main(String[] args) {
        //1a. powerMod(int a, int b, int m)
        System.out.println(PiGenerator.powerMod(2,3,2) == 0);
        System.out.println(PiGenerator.powerMod(2,3,3) == 2);
        System.out.println(PiGenerator.powerMod(5,0,10) == 1);
        System.out.println(PiGenerator.powerMod(1,1,0) == -1);

        //1b. computePiInHex(int precision)
        System.out.println(Arrays.toString(PiGenerator.computePiInHex(2)));
            //expected output: 2, 4
        System.out.println(Arrays.toString(PiGenerator.computePiInHex(5)));
            //expected output: 2, 4, 3, 15, 6
        System.out.println(Arrays.toString(PiGenerator.computePiInHex(10)));
            //expected output: 2, 4, 3, 15, 6, 10, 8, 8, 8, 5

        //2. convertBase(int[] digits, int baseA, int baseB, int precisionB)
        int[] test1 = new int[] {2,4,3,15,6};
        System.out.println(Arrays.toString(BaseTranslator.convertBase(test1,16,26,5)));
            //expected output: [3, 17, 18, 16, 4]

        int[] test2 = new int[] {2,4,3,15,6,10,8,8};
        System.out.println(Arrays.toString(BaseTranslator.convertBase(test2,16,26,8)));
            //expected output: [3, 17, 18, 16, 11, 14, 10, 25]

        //3. convertDigitsToString(int[] digits, int base, char[] alphabet)
        int[] digit_test1 = {3,17,18,16,11};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println(DigitsToStringConverter.convertDigitsToString(digit_test1,26,alphabet));
            //expected output: drsql

        int[] digit_test2 = {3,17,18,16,11,14,10,25};
        System.out.println(DigitsToStringConverter.convertDigitsToString(digit_test2,26,alphabet));
            //expected output: drsqlokz

        //4.

    }
}
