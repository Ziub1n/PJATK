package PPJ.PPJ12;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int arr1[] = new int[10];
        int arr2[] = new int[6];


        for (int i = 0; i < arr1.length; i++) {
            double rand = Math.random() * 100;
            arr1[i] = (int) rand;
        }
        for (int i = 0; i < arr2.length; i++) {
            double rand1 = Math.random() * 100;
            arr2[i] = (int) rand1;
        }


        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

        int arrboth[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrboth[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrboth[i + arr1.length] = arr2[i];
        }
        System.out.println("filled arrboth: " + Arrays.toString(arrboth));

        int max = arrboth[0];
        for (int i = 0; i < arrboth.length; i++) {
            if (arrboth[i] > max) {
                max = arrboth[i];
            }
        }
        System.out.println("max value: " + max);

        int min = arrboth[0];
        for (int i = 0; i < arrboth.length; i++) {
            if (arrboth[i] < min) {
                min = arrboth[i];
            }
        }
        System.out.println("min value: " + min);

        int sort = max - min;
        int arrbothsort[] = new int[sort];
        for (int i = 0; i < sort; i++) {
            arrbothsort[i] = min + i;

        }
        System.out.println(Arrays.toString(arrbothsort));
    }
}
