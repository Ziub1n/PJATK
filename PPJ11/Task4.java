package PPJ.PPJ11;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        boolean arr[] = new boolean[10];
        int counterTrue = 0, counterFalse = 0;
        for (int i = 0; i < arr.length; i++) {
            double rand = Math.random();
            if (rand > 0.5) {
                arr[i] = true;
                counterTrue++;
            } else {
                arr[i] = false;
                counterFalse++;
            }
        }

        System.out.println("Tablica true i false " + Arrays.toString(arr));
        System.out.println("w wygenerowanej tablicy jest " + counterTrue + " true i " + counterFalse + " false");

        boolean t[] = new boolean[counterTrue];
        for (int i = 0; i < t.length; i++) {
            t[i] = true;
        }
        boolean f[] = new boolean[counterFalse];

        System.out.println("tablica True: " + Arrays.toString(t));
        System.out.println("tablica Fake: " + Arrays.toString(f));


    }
}
