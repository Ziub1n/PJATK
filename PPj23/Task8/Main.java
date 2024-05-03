package PPJ.PPj23.Task8;

public class Main {
    public static void main(String[] args) {


        SmokeDetector smokeDetector1 = new SmokeDetector(false);
        SmokeDetector smokeDetector2 = new SmokeDetector(false);

        try {
            int[] tab = new int[10];
            System.out.println(smokeDetector1.isSmokeDetected());
            System.out.println(smokeDetector2.isSmokeDetected());
            System.out.println(tab[15]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");

        }catch (Exception e){
            System.out.println("haha");
        }
        System.out.println("Stop");
    }
}