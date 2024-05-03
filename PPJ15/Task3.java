package PPJ.PPJ15;

public class Task3 {
    public static void main(String[] args) {

        int wrt = 5;


        System.out.print("wrt przed modyfikacja= "+wrt+"\n");
        System.out.print("dostarczona zmienna, oraz jej modyfikacja poprzez pomnozenie przez 5:\t");
        modifyValue(wrt);

        System.out.println("wrt po modyfikacji = "+wrt);

        // wartosc wrt po wykonaniu metody pozostaje taka sama
    }
    public static void modifyValue(int wrt){
        System.out.print(wrt);
        wrt*=5;
        System.out.print(" i "+wrt+"\n");


    }
}
