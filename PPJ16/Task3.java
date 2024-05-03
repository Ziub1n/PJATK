package PPJ.PPJ16;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int armstrongNumber = 153;
        System.out.println(isArmstrongNumber(armstrongNumber));

    }

    public static boolean isArmstrongNumber(int a) {

        boolean isArmstrongN = false;

        int counter = 0, sum = 0,b=a,val = a;
        while (a > 0) {
            a /= 10;
            counter++;
        }

        int [] tab = new int[counter];
        for (int i = 0; i < tab.length; i++) {

            int c=b;
            c%=10;
            tab[i]=c;
            b/=10;

        }
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {

            sum += (int)Math.pow(tab[i],counter);
        }
        if(sum == val ){
            isArmstrongN = true;
        }



        return isArmstrongN;
    }
}
