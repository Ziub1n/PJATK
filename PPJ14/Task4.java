package PPJ.PPJ14;

public class Task4 {
    public static void main(String[] args) {

        int tab[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[0][i]+",");
        }
        for (int i = 1; i < tab.length; i++) {
            System.out.print(tab[i][3]+",");
        }
        for (int i = 1; i < tab.length; i++) {
            System.out.print(tab[3][tab.length-1-i]+",");
        }
        for (int i = 1; i < tab.length-1; i++) {
            System.out.print(tab[tab.length-1-i][0]+",");
        }
        for (int i = 1; i < tab.length-1; i++) {
            System.out.print(tab[1][i]+",");
        }
        for (int i = 1; i < tab.length-1; i++) {
            System.out.print(tab[2][tab.length-1-i]+ (i>1? "":","));
        }


    }
}
