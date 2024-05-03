package PPJ.PPJ13;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int arr[] = new int[3];

        System.out.println("\nPossible actions : ");
        System.out.println("*quit - end program");
        System.out.println("*add - add next element to array");
        System.out.println("*get - remove latest element inputted by user\n");

        System.out.println("format of the order should look like this | number <space> command ");

        Scanner scan = new Scanner(System.in);
        int counter=0;
        boolean exit= true;
       while(exit) {
            System.out.println("input a number from range <-5;5> and command");
            String[] inputString = scan.nextLine().split(" "); //robi tablice

            //1 quit -> ["1","quit"]
            int inputNumber = Integer.parseInt(inputString[0]);
            String inputCommand = inputString[1];

            if(inputNumber>=5 && inputNumber<=-5){
                System.out.println(Arrays.toString(arr));
                exit=false;
            }

            arr[ counter++] = inputNumber;

            switch (inputCommand) {
                case "quit" -> {
                    System.out.println(Arrays.toString(arr));
                    exit=true;
                }
                case "add" -> {
                    arr = addElement(arr);
                    System.out.println(Arrays.toString(arr));
                }
                case "get" -> {
                    arr = getElement(arr);
                    System.out.println(Arrays.toString(arr));
                }
                default -> System.out.println("wrong command");
            }
        }

    }
    public static int[] addElement(int[] arr) {


        int arrPlusOneElement[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arrPlusOneElement[i] = arr[i];
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a new value for new element in array");
        arrPlusOneElement[arrPlusOneElement.length - 1] = scanner.nextInt();

        return arrPlusOneElement;

    }

    public static int[] getElement(int[] arr) {

        int getElement[] = new int[arr.length - 1];

        for (int i = 0; i < getElement.length; i++) {
            getElement[i] = arr[i];
        }
        System.out.println("c: "+Arrays.toString(getElement));
        return getElement;
    }

}
