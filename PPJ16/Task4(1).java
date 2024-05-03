package PPJ.PPJ16;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

       int screenWidth = 5;
       int screenHeight = 5;
       int side = 2;


        calculateSquares(screenWidth,screenHeight,side);




    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {



       int squareHeight= screenHeight/side;
       int squareWidth =screenWidth/side;
       int numberOfSquares = squareWidth*squareHeight;
        System.out.println("In the area are: "+numberOfSquares+" squares");

        int [][] coordinates = new int[numberOfSquares][2];

        int counter=0;
        for (int x = 0; x < squareWidth; x++) {
            for (int y = 0; y < squareHeight; y++) {
                coordinates[counter][0]= x*side;
                coordinates[counter][1]= side+y*side;
                counter++;
            }
        }
        System.out.println(Arrays.deepToString(coordinates));

        return coordinates;
    }
}
