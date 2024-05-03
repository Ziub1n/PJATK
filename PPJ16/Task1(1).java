package PPJ.PPJ16;

public class Task1 {
    public static void main(String[] args) {


        int[][] arr1 = {
                {1,2,3,4,5},
                {2,3,4}
        } ;
        int[][] arr2 = {
                {1,2,3,4},
                {2,3,4}
        } ;

        System.out.println(jestRowna(arr1,arr2));


    }

    public static boolean jestRowna(int[][] arr1,int[][] arr2) {

        boolean TheSame = false;
        int counter=0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].length!=arr2[i].length){
                return false;
            }
        }



        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j]==arr2[i][j]){
                    counter++;
                }
                 }
             if(arr1.length== arr2.length && counter==arr1[i].length){
                  TheSame = true;
            }
        }
                return TheSame;




    }
}
