package PPJ.PPJ17;

public class Task5 {
    public static void main(String[] args) {
        
        int size = 10;
        int[][] arr = new int[size][size];
        fillArr(arr);
        //array print
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
    public static void fillArr(int[][] arr){
        fillArr(arr,0, arr.length-1, 0, arr[0].length-1,1);
    }
    public static void fillArr(int[][] arr, int rowStart, int rowStop, int columnStart, int columnStop, int number){
        for (int i = rowStart; i <= rowStop; i++) {
            for (int j = columnStart; j <= columnStop ; j++) {
                arr[i][j] = number;
            }
        }
        rowStart++;
        rowStop--;
        columnStart++;
        columnStop--;
        if ((rowStart <= rowStop && columnStart <= columnStop))
            fillArr(arr, rowStart, rowStop, columnStart, columnStop, ++number);
    }
}
