package PPJ.PPJ10;

public class Task2 {
    public static void main(String[] args) {
        {
            int n = 30, suma = 0;
            int wynik = (n * (n + 1) * (n + 2)) / 3;

            for (int i = 1; i <= n; i++) {
                suma += (i * (i + 1));
            }
            System.out.println(suma);

            if (wynik == suma) {
                System.out.println("Poprawne");
            } else {
                System.out.println("Nie poprawne");
            }
        }
        int n = 4, suma = 0;
        double wynik = ((Math.pow(-1,n-1))*n*(n+1))/2;

        for (int i = 1; i <= n; i++) {
            suma += (Math.pow(-1,i-1) *Math.pow(i,2));
        }
        System.out.println(suma);

        if ((int)wynik == suma) {
            System.out.println("Poprawne");
        } else {
            System.out.println("Nie poprawne");
        }






    }
}
