package PPJ.PPJ15;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };
        int arrayLength = tab[0].length + tab[1].length + tab[2].length;

        int[] arr = new int[arrayLength];


        for (int i = 0; i < arrayLength; i++) {
            if (tab[0].length > i) {
                arr[i] = tab[0][i];
            }
            if (tab[1].length > i) {
                arr[i + tab[0].length] = tab[1][i];
            }
            if (tab[2].length > i) {
                arr[i + (tab[0].length + tab[1].length)] = tab[2][i];
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
