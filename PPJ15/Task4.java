package PPJ.PPJ15;

public class Task4 {
    public static void main(String[] args) {

        int a=1,b=2,c=4;


        System.out.println("najwieksza liczba jest: "+findMax(a,b,c));



    }
    public static int findMax(int a,int b,int c){

        if(a>b && a>c){
           return a;
        } if (c>b &&c>a ) {
            return c;
        }
        return b;

    }
}
