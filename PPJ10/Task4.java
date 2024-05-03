package PPJ.PPJ10;

public class Task4 {
    public static void main(String[] args) {

        double tab[]={1,3,5,6,7,8,9,12,14,18};
        System.out.print("[");
        for (int i = 0; i <tab.length ; i++) {
            System.out.print((int)tab[i]+", ");
        }System.out.print("]");

        System.out.print("\n[");
        for (int i = 0; i <tab.length ; i++) {
            if(i%2==0){
                System.out.print((int)tab[i]+", ");
         }
        }System.out.println("]");

        System.out.print("[");
        for (int i = 0; i <tab.length ; i++) {
            if(tab[i]%2!=0){
                System.out.print((int)tab[i]+", ");
            }
        }System.out.println("]");
    }}
