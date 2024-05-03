package PPJ.PPJ13;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        double random = Math.random() * 20;
        int arr1[] = new int[(int) random];
        double random1 = Math.random() * 20;
        int arr2[] = new int[(int) random1];
        double random3 = Math.random() * 20;
        int arr3[] = new int[(int) random3];


        for (int i = 0; i < arr1.length; i++) {
            double randomNumbers = Math.random() * 20;
            arr1[i] = (int) randomNumbers;
        }
        for (int i = 0; i < arr2.length; i++) {
            double randomNumbers2 = Math.random() * 20;
            arr2[i] = (int) randomNumbers2;
        }
        for (int i = 0; i < arr3.length; i++) {
            double randomNumbers3 = Math.random() * 20;
            arr3[i] = (int) randomNumbers3;
        }
        System.out.print("first array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("second array: ");
        System.out.println(Arrays.toString(arr2));
        System.out.print("third array: ");
        System.out.println(Arrays.toString(arr3));


        int mainArray[][] = {arr1, arr2, arr3};

        System.out.print("Main Array: [");
        for (int i = 0; i < mainArray.length; i++) {
            for (int j = 0; j < mainArray[i].length; j++) {
                System.out.print(mainArray[i][j] + ", ");
            }
        }
        System.out.print("]");
    }

}
