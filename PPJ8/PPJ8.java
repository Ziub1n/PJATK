package PPJ.PPJ8;

import java.util.Scanner;

public class PPJ8 {
    public static void main(String[] args) {


           System.out.println("\n Task1 \n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("poidaj pierwszy kat :");
        int kat1 = scanner.nextInt();
        System.out.print("poidaj drugi kat :");
        int kat2 = scanner.nextInt();
        System.out.print("poidaj trzeci kat :");
        int kat3 = scanner.nextInt();

        if ((kat1 + kat2 + kat3) > 180 || (kat1 + kat2 + kat3) != 180) {
            System.out.println("taki trojkat nie istnieje");
        }
        if ((kat1 + kat2 + kat3) == 180) {
            System.out.println("taki trojkat istnieje");
            if (kat1 < 90 && kat2 < 90 && kat3 < 90) {
                System.out.println("trojkat jest ostrokatny");
            } else {
                System.out.println("trojkat nie jest ostrokatny");
            }
        }
        System.out.println("\n Task2 \n");

        double a = 1, b = 6, c = 8, deltaSqrt, delta, x1, x2;
        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("delta : " + delta);
        deltaSqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        System.out.println("piewiastek z delty : " + deltaSqrt);
        if (delta > 0) {
            x1 = (-b - deltaSqrt) / (2 * a);
            System.out.println("x1: " + x1);
            x2 = (-b + deltaSqrt) / (2 * a);
            System.out.println("x2: " + x2);
            System.out.println("to rownanie ma 2 miejsca zerowe :" + x1 + " oraz " + x2);
        }
        if (delta < 0) {
            System.out.println("to rownanie kwadratowe nie ma miejsc zerowych ");

        }
        if (delta == 0) {
            x1 = (-b) / 2 * a;
            System.out.println("to rownanie kwadratowe ma tylko jedno miejsce zerowe :");
        }


        System.out.println("\n Task3 \n");

        //trojka  = 50 do 62.5
        //trojkaIpol = 62,6 do 74,9
        //czworka = 75 do 81,24
        //czworkaipol = 81,25 do 87.4
        //piatka 87.5 do 100
        Scanner s = new Scanner(System.in);
        System.out.print("wpisz ilosc zdobytych punktow: ");
        double iloscPunktow = s.nextDouble();
        System.out.print("wpisz maksymalna ilosc punktow do zdobycia: ");
        double maksymalnaIloscPunktow = s.nextDouble();

        double procenty = iloscPunktow / maksymalnaIloscPunktow * 100;
        System.out.println("zdobyleś " + procenty + " procent");

        if (procenty < 50.0)
            System.out.println("nie zdales");
        if (procenty >= 50.0 && procenty <= 62.5)
            System.out.println("dostajesz 3");
        if (procenty >= 62.6 && procenty <= 74.9)
            System.out.println("dostajesz 3+");
        if (procenty >= 75.0 && procenty <= 81.24)
            System.out.println("dostajesz 4");
        if (procenty >= 81.25 && procenty <= 87.4)
            System.out.println("dostajesz 4+");
        if (procenty >= 87 && procenty <= 100)
            System.out.println("dostajesz 5");

        // 15/45 - nie zdales
        // 5/8 - 3
        // 3/5.5 - 3
        // 40/45 - 5

        System.out.println("\n Task4 \n");

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }

        System.out.println("\n Task5 \n");

        int wrt = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * wrt);
        }

        System.out.println("\n Task6 \n");

        int liczba = 0;
        boolean instrukcja = false;
        while (instrukcja) {
            liczba++;
            System.out.println("while" + liczba);
        }
        do {
            liczba++;
            System.out.println("do-while " + liczba);
        } while (instrukcja);

        //do-while zrobi polecenie jeden raz nawet jesli instrukcja pentli == false, a while nie

        System.out.println("\n Task7 \n");

        Scanner sc = new Scanner(System.in);
        int e = 1, newlos = 0, los;

        while (e != 0) {
            System.out.print("podaj liczbe: ");
            los = sc.nextInt();
            if (los != 0) {
                System.out.println("!zla liczba ,podaj inna!");
            }
            e = los;
            newlos += los;

        }
        System.out.println("suma liczb ktore podawałes wynosi: " + newlos);

        System.out.println("\n Task8 \n");

        double n = 0, szereg = 0;
        int h = 1;

        while (n < 10) {
            double dwaDoN = Math.pow(2, n);
            szereg = 1 / dwaDoN;
            n++;
            System.out.println(h + ".element szeregu to : " + szereg);
            h++;
        }

        System.out.println("\n Task9 \n");

        int dzien = 10, miesiac = 12, ileDni, p;
        p = dzien - 1;

        //rok-365 dni

        if (miesiac == 1) {
            System.out.println("od poczatku roku minelo:" + p);
        } else if (miesiac == 2) {
            ileDni = 31 + p;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 3) {
            ileDni = 31 + p + 28;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 4) {
            ileDni = 31 + p + 28 + 31;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 5) {
            ileDni = 31 + p + 28 + 31 + 30;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 6) {
            ileDni = 31 + p + 28 + 31 + 30 + 31;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 7) {
            ileDni = 31 + p + 28 + 31 + 30 + 31 + 30;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 8) {
            ileDni = 31 + p + 28 + 31 + 30 + 31 + 30 + 31;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 9) {
            ileDni = 31 + p + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 10) {
            ileDni = 31 + p + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 11) {
            ileDni = 31 + p + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            System.out.println("od poczatku roku minelo:" + ileDni);
        } else if (miesiac == 12) {
            ileDni = 31 + p + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
            System.out.println("od poczatku roku minelo:" + ileDni);
        }

       System.out.println("\n Task10 \n");

        for (int i =1 ; i <= 6; i++) {
            System.out.print(i+"  ");
            if(i%2==0){
                for(int j = 0; j <5;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j = 0;j<4;j++){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }


    }
}
