package PPJ.PPJ5;


public class PPJ5 {

    public static void main(String[] args) {

        System.out.println("\nTask1\n");
        int x = 5;
        System.out.println((x = 4) * x);


        System.out.println("\nTask2\n");

        float a = ((float)((1 + 2 * 3 + 4)/( 5 - 6))+78)/(9.0f-(10.0f / 11.0f));
        System.out.println(a);

        System.out.println("\nTask3\n");

        byte zmByte2 = Byte.MIN_VALUE;
        byte zmByte = Byte.MAX_VALUE;

        System.out.println("byte: " + zmByte2 + " " + zmByte);

        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("short: " + zmShort + " " + zmShort2);

        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Int: " + zmInt + " " + zmInt2);

        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("Long: " + zmLong + " " + zmLong2);

        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        System.out.println("float: " + zmFloat + " " + zmFloat2);

        double zmDouble = Double.MIN_VALUE;
        double zmDouble2 = Double.MAX_VALUE;
        System.out.println("Double: " + zmDouble + " " + zmDouble2);

        System.out.println("\nTask4\n");

            int year = 2016;
            boolean isYear = (year % 4 == 0 && year % 100 != 0) || (year%400== 0);
            System.out.println("Rok: "+year + (isYear? " Jest przestepny":" nie jest przestepny"));

        System.out.println("\nTask5\n");

            //---1234.567---
            //1234.567L  nie jest to typ long , jest to liczba zmiennoprzecinkowa
            System.out.println(1.234567E06); //nie jest to samo
            System.out.println(12.34567E2); // to jest to samo co 1234.567
            System.out.println(1234567E-3); // jest to samo

        System.out.println("\nTask5\n");

        //tylko double && long








    }

}
