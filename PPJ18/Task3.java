package PPJ.PPJ18;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {12,32,45,32,11,1,5,6,7,64};

        bubbleSort(arr);
        printArray(arr);
    }
    static void bubbleSort(int[] arr){



        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    static void printArray(int[] arr){
        int counter=0;
        System.out.print("[");
        for(int val : arr){
            counter++;
            System.out.print(val+((counter==arr.length)?" ":", "));
        }
        System.out.print("]");
    }
}
