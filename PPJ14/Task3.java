package PPJ.PPJ14;

public class Task3 {
    public static void main(String[] args) {
        int size = 50,counter=0;
        do {
            int x = (int) (Math.random() * ((1.2 * size) - (0.2 * size)) + (0.2 * size));
            int y = (int) (Math.random() * ((1.2 * size) - (0.2 * size)) + (0.2 * size));
            System.out.println("X =" + x);
            System.out.println("Y =" + y);


            int[][] arr = new int[size][size];

            if (!((x >= 1) && (x <= size)) || !((y >= 1) && (y <= size))) {
                System.out.println("coordinates outside array range(x,y)");
                counter++;
            }
            System.out.println("~~~~~~~~~~~~");
        } while (counter < 20);

    }
}
