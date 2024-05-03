package PPJ.PPJ18;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {


        int month= 3;
        int year =2022;

        printMonth(month, year);


    }
    static void printMonth(int m, int y) {



        int[] arrOfDays = new int[daysCounter(m, y)];


        for (int i = 0, j = 1; i <= arrOfDays.length - 1; i++, j++) {
            arrOfDays[i] = j;
        }

        //biblioteka calendar

        Calendar calendar = new GregorianCalendar(y, m - 1, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // wyświetlenie wszystkich dni miesiąca
        for (int i = 1; i <= arrOfDays.length; i++) {
            // jeśli dzień tygodnia jest równy 7 (czyli niedziela), przechodzimy do nowej linii
            if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.println();
            }
            // wyświetlenie dnia miesiąca
            System.out.printf("%2d ", i);
            // zwiększenie licznika dni o jeden
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        System.out.println();
    }







    static int daysCounter(int month, int year) {

        int numberOfDays = 0;

        if (year % 4 == 0) {

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> numberOfDays = 31;
                case 2 -> numberOfDays = 29;
                case 4, 6, 9, 11 -> numberOfDays = 30;
                default -> System.out.println("Wrong month was inputted");
            }
        } else {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> numberOfDays = 31;
                case 2 -> numberOfDays = 28;
                case 4, 6, 9, 11 -> numberOfDays = 30;
                default -> System.out.println("Wrong month was inputted");
            }


        }

        return numberOfDays;
    }

}
