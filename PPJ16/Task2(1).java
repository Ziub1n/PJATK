package PPJ.PPJ16;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int a = 12345;


        splitToDigits(a);
    }

    public static int[] splitToDigits(int a) {
        int counter = 0;
        int b = a;
        while (a != 0) {
            if (a >= 1) {
                a /= 10;
                counter++;

            }
        }


        int[] temp = new int[counter];

        for (int i = temp.length-1; i >= 0; i--) {

            int c = b % 10;
            b /= 10;
            temp[i] = c;
        }

        System.out.println(Arrays.toString(temp));

        return temp;
    }
}
