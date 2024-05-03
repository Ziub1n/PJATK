package PPJ.PPJ17;

public class Task2 {

    public static void main(String[] args) {
        int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3};
        System.out.println( count(a, 0, 2));

    }
    static int count(int[] arr, int from, int what) {

        if (from >= arr.length) {
            return 0;
        }
        int counter = (arr[from]==what)? 1:0;
        return  counter+count(arr,from+1,what);
    }
}