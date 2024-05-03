package PPJ.ZadaniaKolokwium2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("/file.txt");


        try {
           Scanner scanner= new Scanner(file);
           String[] line = scanner.nextLine().split(" ");
            for (int i = 0; i < line.length; i++) {


                System.out.println(Integer.valueOf(line[i]));

            }






        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
