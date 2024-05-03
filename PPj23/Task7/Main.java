package PPJ.PPj23.Task7;

public class Main {
    public static void main(String[] args) {

        Drzewo[] las = new Drzewo[6];

        las[0]=new Morelowce();
        las[1]=new Sosny();
        las[2]=new Modrzewie();
        las[3]= new Deby();
        las[4]=new Osiki();
        las[5]=new Sliwy();

        for (int i = 0; i < las.length; i++) {
            las[i].pokazInfo();
        }
        System.out.println("\n\n");
        for (int i = 0; i < las.length; i++) {
            las[i].zerwijOwoc();
        }

    }
}
