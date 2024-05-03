package PPJ.PPJ13;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int n = 6;
        if (n <= 2) {
            System.out.println("podaj liczbe wieksza od 2");
            return;
        }
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            double randomArrayValues = Math.random() * 11;
            arr[i] = (int) randomArrayValues;

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter = 1;
        int prev=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == (arr[j])) {
                    counter++;

                }else{
                    prev=arr[i];
                    counter=1;
                }
            }

        }
        System.out.println(counter);
        System.out.println(counter>=n/2);
    }
}
