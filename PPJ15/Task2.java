package PPJ.PPJ15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("wpisz liczbe, zostanie ona wypisana na ekranie :}");
        while(true) {
            int input = 0;
            show(input);
        }
    }

    public static void show(int input) {
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        System.out.println(input);

    }
}
