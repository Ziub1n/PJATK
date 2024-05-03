package PPJ.PPJ12;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        byte arr[] = {1, 2, 3,
                4, 5, 6,
                7, 8, 9};

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        printArr(arr);


    }

        public static void printArr(byte[] arr) {
            for (int j = 0; j < arr.length; j++) {
                if ((double) arr[j] % 3 == 0) {
                    System.out.println(arr[j]);
                } else {
                    System.out.print(arr[j] + "\t");
                }
            }
        }}