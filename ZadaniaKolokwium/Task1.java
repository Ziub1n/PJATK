package PPJ.ZadaniaKolokwium;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][]arr= {{1,2,3},{4,5},{6}};
        multiplyArrayIndex(arr);
    }
    public static void multiplyArrayIndex(int[][]arr){
        int tempLength=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tempLength++;
            }
        }
        int[] temp =new int[tempLength];
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[counter++]=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
