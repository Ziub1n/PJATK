package PPJ.PPJ13;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int B[] = {8, 7, 6, 5, 4, 3, 1, 1, 2};
        int C[] = new int[A.length + B.length];


        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        int j = 0;
        for (int i = A.length; i < C.length; i++) {
            C[i] = B[j];
            j++;
        }
        Arrays.sort(C);
        System.out.println("C :" + Arrays.toString(C));

    }
}
