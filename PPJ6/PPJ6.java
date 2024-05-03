package PPJ.PPJ6;

import java.util.Scanner;

public class PPJ6 {
    public static void main(String[] args) {
        {
            System.out.println("\n Task1 \n");

            int a = -3;
            if (a < 0) {

                System.out.println("←- Negative");
                a = a * -1;
                System.out.println("←- Absolute value is: " + a);

            } else {

                System.out.println("←- Positive");
                System.out.println("←- Absolute value is: " + a);
            }
        }

        {
            int a = 5;
            if (a < 0) {
                System.out.println("←- Negative");
                a = a * -1;
                System.out.println("←- Absolute value is: " + a);
            }
            if (a >= 0) {
                System.out.println("←- Positive");
                System.out.println("←- Absolute value is: " + a);
            }
        }
        System.out.println("\n Task2 \n");
        {
            boolean allAbove;
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();
            System.out.println("\nTest 1\n");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            allAbove = a > 0.2 && b > 0.2 && c > 0.2;
            System.out.println(allAbove);
            a = b;
            b = c;
            c = Math.random();
            allAbove = a > 0.2 && b > 0.2 && c > 0.2;
            System.out.println("\nTest 2\n");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println(allAbove);
            a = b;
            b = c;
            c = Math.random();
            allAbove = a > 0.2 && b > 0.2 && c > 0.2;
            System.out.println("\nTest 3\n");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println(allAbove);
        }
        System.out.println("\n Task3 \n");
        {
            boolean a, b, c;
            int wrt = -3;

            a = (-15 < wrt && wrt <= 10 || -5 < wrt && wrt < 0 || wrt > 5 && wrt < 10);
            b = (wrt <= -13 || wrt > -8 && wrt <= -3);
            c = (wrt <= -4);

            System.out.println("Nalezy do zbioru a  " + a);
            System.out.println("Nalezy do zbioru b = " + b);
            System.out.println("nalezy do zbioru c = " + c);
        }
        System.out.println("\n Task4 \n");
        {
            int a = 5;
            int b = 5;
            System.out.println((!(a < b) && !(a > b)));
            // zapis w prostszej postaci :(a==b)
        }
        System.out.println("\n Task5 \n");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("wpisz dowolny znak :");
            char ch = scanner.next().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                System.out.println(ch + "- ten znak jest samogloska ");
            } else {
                System.out.println(ch + "- ten znak jest spolgloska");
            }
        }
        System.out.println("\n Task6 \n");
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("wpisz liczbe calkowita ktora bedzie oznaczala miesiac: ");
            int val = scanner.nextInt();
            while(val>12 || val<0){
                System.out.println("nie ma takiego miesiąca :)");           //sprawdza czy podany miesiac jest poprawny
                return;
            }
            System.out.print("wpisz liczbe calkowita ktora bedzie oznaczala rok: ");
            int val2 = scanner.nextInt();

            if (val2 % 4 == 0){
                System.out.println("podany rok jest przestepny ");
                if (val == 4 || val == 6 || val == 9 || val == 11) {
                    System.out.println("podany miesiac ma 30 dni");
                } else if (val==2) {
                    System.out.println("podany miesiac ma 29 dni");
                }else {
                    System.out.println("podany miesiac ma 31 dni");
                }

            } if (val2%4!=0){
            System.out.println("podany rok nie jest przestepny ");
                if (val == 4 || val == 6 || val == 9 || val == 11) {
                System.out.println("podany miesiac ma 30 dni");
            } else if (val==2) {
                System.out.println("podany miesiac ma 28 dni");
            }else {
                System.out.println("podany miesiac ma 31 dni");
            }
        }
        }
    }
}

