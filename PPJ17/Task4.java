package PPJ.PPJ17;

public class Task4 {
    public static void main(String[] args) {

        char tabA[] = {'A','n','n','a'};
        inSideOut(tabA);
        System.out.println();
        char tabB[] = {'k','a','j','a','k'};
        inSideOut(tabB);
    }
    private static void inSideOut(char[] tab) {
        inSideLeft(tab);
        inSideRight(tab);
    }
    public static void inSideLeft(char[] tab){
        if(tab.length >= 2){
            char [] arr = cutFirstAndLast(tab);
            inSideLeft(arr);
            System.out.print(tab[0]);
        }
    }
    public static void inSideRight(char[] tab){
        if(tab.length >= 2){
            System.out.print(tab[tab.length-1]);
            char [] arr = cutFirstAndLast(tab);
            inSideRight(arr);
        }
    }
    public static char[] cutFirstAndLast(char[] tab){
        char [] result = new char[tab.length-2];
        int resultIndex = 0;
        for (int i = 1; i < result.length; i++) {
            result[resultIndex++] = tab[i];
        }
        return result;
    }
}
