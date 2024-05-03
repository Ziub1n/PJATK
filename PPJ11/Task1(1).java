package PPJ.PPJ11;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};


        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int rand = (int) (Math.random() * arr.length);
            arr[i] = arr[rand];
            arr[rand] = temp;

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("o\t");
                }
            }
            System.out.println();

        }

    }
}