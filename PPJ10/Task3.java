package PPJ.PPJ10;

public class Task3 {
    public static void main(String[] args) {
        int a=1,b=84;



        for (int i = 1; a < b && a < 100 && b < 100 ; i++) {
            double r = Math.random(),random =r*100;

                if (a <= random && b >= random) {

                    System.out.println("Zgadłeś za: "+i+" razem, szukana liczba to: "+(int)random);
                    return;
                }else{
                    System.out.println("Wylosowana liczba to: "+(int)random+" znajduje sie ona poza przedziałem ["+a+","+b+"]");
                }


            }
        }


    }

