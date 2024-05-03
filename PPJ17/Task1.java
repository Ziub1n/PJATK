package PPJ.PPJ17;

public class Task1 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 7, 5, 3},
                {8, 6, 4, 2}
        };

        System.out.println("Before: ");
        showMatrixArray(arr);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        transposeMatrixSwap(arr);
        horizontallySwap(arr);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("After: ");
        showMatrixArray(arr);

    }

    public static void transposeMatrixSwap(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
    }

    public static void horizontallySwap(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;

            }
        }
    }

    public static int[][] showMatrixArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }
}
