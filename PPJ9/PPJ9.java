package PPJ.PPJ9;

import java.util.Scanner;



public class PPJ9 {
    public static void main(String[] args) {

        System.out.println("\nTask1\n");

        for (char i = 75; i <= 150; i++) {

            System.out.println(i + "-" + (int) i);
        }

        System.out.println("\nTask2\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj wartosc w PLN:"); //użyj przecinka zamiast kropki
        double price = scanner.nextDouble();
        int count ;
        while (price > 0.01) {

            if (price >= 5) {
                count = (int) (price / 5);
                System.out.println(count + " * 5 zł");
                price = price - (5 * count);
            }
            if (price >= 2) {
                count = (int) (price / 2);
                System.out.println(count + " * 2 zł");
                price = price - (2 * count);
            }
            if (price >= 1) {
                count = (int) (price / 1);
                System.out.println(count + " * 1 zł");
                price = price - (1 * count);
            }
            if (price >= 0.5) {
                count = (int) (price / 0.5);
                System.out.println(count + " * 50 gr");
                price = price - (0.5 * count);
            }
            if (price >= 0.2) {
                count = (int) (price / 0.2);
                System.out.println(count + " * 20 gr");
                price = price - (0.2 * count);
            }
            if (price >= 0.1) {
                count = (int) (price / 0.1);
                System.out.println(count + " * 10 gr");
                price = price - (0.1 * count);
            }
            if (price >= 0.05) {
                count = (int) (price / 0.05);
                System.out.println(count + " * 5 gr");
                price = price - (0.05 * count);
            }
            if (price >= 0.02) {
                count = (int) (price / 0.02);
                System.out.println(count + " * 2 gr");
                price = price - (0.02 * count);
            }
            if (price >= 0.01) {
                count = (int) (price / 0.01);
                System.out.println(count + " * 1 gr");
                price = price - (0.01 * count);
            }
        }


        System.out.println("\nTask3\n");

        byte number = 16; // range(0;15)
        char hex = switch (number){
            case 0,1,2,3,4,5,6,7,8,9-> (char) (number + 48);
            case 10-> 'A';
            case 11-> 'B';
            case 12-> 'C';
            case 13-> 'D';
            case 14-> 'E';
            case 15-> 'F';
            default-> (char)number;
        };
        System.out.println("hex: " + hex);

        System.out.println("\nTask4\n");


        Scanner sc = new Scanner(System.in);
        System.out.println("wpisz liczbe calkowita");
        double n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=2;j<=4;j++){
                System.out.print((int)Math.pow(i,j)+" ");
            }
            System.out.println();
       }



       int size = 3;

        for (int i =-size; i <=size ; i++) {
            String temp = "";

            for  (int j = -size; j<=size; j++){
                if(Math.abs(i)+Math.abs(j)<=size){
                    temp +=" * ";
                }else{
                    temp +=" . ";
                }

            }
            System.out.println(temp);
        }







    }}





















