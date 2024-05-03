package PPJ.PPJ11;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        long[] arr = new long[8];

        arr[0] = 8;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 1;
        }
        System.out.println(Arrays.toString(arr));

        boolean t = true;
        while (t) {
            int i1 = (int) (Math.random() * arr.length);
            int i2 = (int) (Math.random() * arr.length);

            long temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;

            t = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] + 1 == arr[i]) t = true;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
