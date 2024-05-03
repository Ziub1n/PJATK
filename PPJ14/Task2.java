package PPJ.PPJ14;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~      GRA W KOSCI    ~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner scanner = new Scanner(System.in);


        int counter = 0;
        int[][] arr = {{0, 0}};
        boolean wrongInput = true;
        while (wrongInput) {
            System.out.println("Wpisz r (roll) - rzut koscmi\nWpisz s (show)- pokaz wyniki losowania");
            String input = scanner.next();
            switch (input) {

                case "r" -> {
                    for (int i = 0; i < 2; i++) {
                        double rzut = Math.random() * 6 + 1;
                        arr[counter][i] = (int) rzut;
                        System.out.println(((i == 0) ? "pierwszy rzut :" : "drugi rzut :") + arr[counter][i]);
                    }
                    System.out.println();
                    arr = addElements(arr);
                    counter++;

                }
                case "s" -> {
                    for (int i = 0, c = 1; i < arr.length - 1; i++, c++) {
                        System.out.print(c + ". rzut :[");
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + (j>0? "":","));
                        }
                        System.out.println("]\n");
                    }
                }
                default -> {
                    System.out.println("wpisales zla komende");
                    wrongInput = false;
                }
            }
        }
    }

    public static int[][] addElements(int[][] arr) {
        int[][] arrayTemp = new int[arr.length + 1][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrayTemp[i][j] = arr[i][j];
            }
        }
        return arrayTemp;
    }
}
