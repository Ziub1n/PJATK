package PPJ.PPj19;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask 1\n");

        Word arr = new Word();
        //dodawanie kolejnych znakow ciagu
        arr.addChar('P');
        arr.addChar('P');
        arr.addChar('J');
        //wyswietla ciag
        arr.show();
        //ilosc znakow w ciagu
        System.out.println(arr.length());
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nTask 2\n");

        Kwadrat kwadrat = new Kwadrat(10);
        kwadrat.show();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nTask 3\n");

        Walec walec = new Walec(3,10);
        walec.show();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nTask 4\n");
        KulaW  kulaWWalcu = new KulaW(walec);
        KulaW kulaWszescianie = new KulaW(kwadrat);

        KulaW kula = new KulaW();


        System.out.println("\t~~~~~~~~~~~~~~~~Kula~~~~~~~~~~~~~~~~~~");
        System.out.println("* promien kuli: "+kula.getPromien()+"\t");
        kula.show();
        System.out.println("\t~~~~~~~~~~~~~~~Kwadrat~~~~~~~~~~~~~~~~");
        System.out.println("* bok kwadratu: "+kwadrat.getBok());
        kwadrat.show();
        kulaWszescianie.czyMiesciSieWSzescianie(kwadrat);
        System.out.println("\t~~~~~~~~~~~~~~~~Walec~~~~~~~~~~~~~~~~~~");
        System.out.println("* promien walca: "+walec.getPromien());
        System.out.println("* wysokosc walca: "+walec.getWysokosc());
        walec.show();
        kulaWWalcu.czyMiesciSieWWalcu(walec);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\tTask5\t");
        KulaNa kulaNaWalcu =new KulaNa(walec);
        KulaNa kulaNaSzescianie = new KulaNa(kwadrat);
        kulaNaSzescianie.czyOpisanaNaSzescianie(kwadrat);
        kulaNaWalcu.czyOpisanaNaWalcu(walec);






    }
}
