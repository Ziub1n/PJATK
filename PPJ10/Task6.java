package PPJ.PPJ10;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int suma = 0, counter = 0;
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 26) + 65); // randomowo z przedzialu 90-65
            if (arr[i] >= 65 && arr[i] <= 90) {
                System.out.println((char) arr[i]);
            }
        }
       Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("podaj duza litere z klawiatury : ");
            char input = scanner.next().charAt(0);

            for (int i = 0; i < arr.length; i++) {
                if (input == arr[i]) {
                    suma++;
                    counter++;
                    arr[i]=0;

                }

            }
            if (suma > 0) {

                System.out.println("element wystepuje " + suma + " raz");
                suma = 0;



            } else {
                System.out.println("element nie wystepuje ani razu");
            }



        }while(arr[0]==0 && arr[1]==0&&arr[2]==0 && arr[3]==0&&arr[4]==0 );
    }
}
