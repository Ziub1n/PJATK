package PPJ.PPJ10;

public class Task5 {
    public static void main(String[] args) {
        char[] arr = {'b', 'h', 'a'};

        int index = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < index)
                index = i;
        }
        System.out.println("\nindex elementu o najmniejszej wartosci to: "+index);
    }
}