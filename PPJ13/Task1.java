package PPJ.PPJ13;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {


        int n = 8;
        if (n <= 2) {
            System.out.println("podaj liczbe wieksza od 2");
            return;
        }
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            double randomArrayValues = Math.random() * 30;
            arr[i] = (int) randomArrayValues;

        }
        //sort Array
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter--;
                }
            }
            counter++;
        }

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[temp]) {
                temp++;
                arr[temp] = arr[i];
            }
        }
        System.out.print("elementow tej tablicy bez powtorek jest: " + counter + " a sa nimi: ");
        int[] uniqueArr = new int[temp + 1];
        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = arr[i];
            System.out.print(uniqueArr[i] + ", ");
        }


    }

}

