package PPJ.ZadaniaKolokwium;

import java.util.Arrays;

public class Task2 {


        public static void main(String[] args) {
            int n = 5;
            int[] primeNumbers = new int[n];

            int count = 0;
            for (int i = 2; count < n; i++) {
                if (isPrime(i)) {
                    primeNumbers[count] = i;
                    count++;
                }
            }


            System.out.println(Arrays.toString(primeNumbers));
        }

        public static boolean isPrime(int number) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

