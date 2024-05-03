package PPJ.PPJ12;

public class Task2 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};
        int a = arr.length - 1;
        int counter = 0, isNumberOdd;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[a - i]) {
                counter++;
            }
        }
        if (counter % 2 != 0) {
            System.out.println("wpisz parzysta liczbe wartosci w tablicy");
        } else if (counter < arr.length) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }


    }
}
