package PPJ.PPJ18;

import java.util.Arrays;
public class Task4 {

        public static void main (String[] args) {
            System.out.println("Wait...");
            System.out.println(FuncStat.fiboR(5));
            System.out.println(FuncStat.fiboI(5));
            System.out.println(FuncStat.factR(12));
            System.out.println(FuncStat.factI(12));
            System.out.println(FuncStat.gcdR(12125,40643));
            System.out.println(FuncStat.gcdI(12125,40643));
            int[] a = {3,8,2,9,7,4};
            System.out.println("Max : " + FuncStat.maxElem(a,0));
            System.out.println("Num even: " + FuncStat.numEven(a,0));
            System.out.println("Before: " + Arrays.toString(a));
            FuncStat.reverse(a,0);
            System.out.println("After : " + Arrays.toString(a));
            System.out.println("Is ’radar’ a palindrom? " +
                    FuncStat.isPalindrom("radar"));
            System.out.println("Is ’abba’ a palindrom? " +
                    FuncStat.isPalindrom("abba"));
            System.out.println("Is ’rover’ a palindrom? " +
                    FuncStat.isPalindrom("rover"));


        }

    public class FuncStat {
        // Funkcja obliczająca n-tą liczbę Fibonacciego w sposób rekurencyjny
        public static int fiboR(int n) {
            if (n <= 1) {
                return n;
            }
            return fiboR(n - 1) + fiboR(n - 2);
        }

        // Funkcja obliczająca n-tą liczbę Fibonacciego w sposób iteracyjny
        public static int fiboI(int n) {
            if (n <=1) {
                return n;
            }
            int a = 0;
            int b = 1;
            int result=0;

            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }

            return result;
        }

        // Funkcja obliczająca n! w sposób rekurencyjny
        public static int factR(int n) {
            if (n == 0) {
                return 1;
            }
            int result = n * factR(n - 1);
            return result;
        }

        // Funkcja obliczająca n! w sposób iteracyjny
        public static int factI(int n) {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        }

        // Funkcja obliczająca największy wspólny dzielnik w sposób rekurencyjny
        public static int gcdR(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcdR(b, a % b);
        }

        // Funkcja obliczająca największy wspólny dzielnik w sposób iteracyjny
        public static int gcdI(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // Funkcja zwracająca największy element tablicy w sposób rekurencyjny
        public static int maxElem(int[] arr, int from) {
            if (from == arr.length - 1) {
                return arr[from];
            }

            int max = maxElem(arr, from + 1);

            return arr[from] > max ? arr[from] : max;
        }

        public static int numEven(int[] arr, int from) {
            if (from >= arr.length) {
                return 0;
            }

            int count = 0;
            if (arr[from] % 2 == 0) {
                count++;
            }

            return count + numEven(arr, from + 1);
        }
        public static void reverse(int[] arr, int from) {
            if (from >= arr.length / 2) {
                return;
            }

            int tmp = arr[from];
            arr[from] = arr[arr.length - from - 1];
            arr[arr.length - from - 1] = tmp;

            reverse(arr, from + 1);
        }
        public static boolean isPalindrom(String s) {
            if (s.length() <= 1) {
                return true;
            }

            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            }

            return isPalindrom(s.substring(1, s.length() - 1));
        }

    }
}
