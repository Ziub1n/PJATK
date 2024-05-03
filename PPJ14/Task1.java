package PPJ.PPJ14;

public class Task1 {
    public static void main(String[] args) {

        float[][] arr =new float[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                double random = Math.random()*11;
                arr[i][j]=(float)random;

            }
        }

        int[][] temp={
            {1,2,3},//0,3
            {4,5,6},//1,1
            {7,8,9},//2,0
        };
        float sumL =0;
        for (int i = 0; i < arr.length; i++) {
            sumL += arr[i][i];

        }
        System.out.println("suma lewej przekatnej: "+sumL);

        float sumP=0;
        for (int i = 0; i < arr.length; i++) {
            sumP +=arr[arr.length-1-i][i];
        }
        System.out.println("suma Prawej przekatnej: "+sumP);

    }
}
