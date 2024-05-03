package PPJ.PPJ10;
import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {

        System.out.println("\nTask1\n");
        Scanner scanner = new Scanner(System.in);

        String[] tab = new String[]{"North", "East", "South", "West"};
        int counter = 0;
        char directions, unicode='\u27F6';
        do  {
            directions = scanner.next().charAt(0);
            if ((int) directions == 100) {
                if (3 <= counter) {
                    counter=0;
                    System.out.println("D"+unicode+"\n" + tab[counter]);
                } else {
                    counter++;
                    System.out.println("D"+unicode+"\n" + tab[counter]);
                }
            }
            if ((int) directions == 97) {
                if ( 0<counter) {
                    --counter;
                    System.out.println("A"+unicode+"\n" + tab[counter]);
                } else {
                    counter=3;
                    System.out.println("A"+unicode+"\n" + tab[counter]);
                }
            }
         }while(directions!='q');
        }}
