package PPJ.PPj22_Task3;

public class Main {
    public static void main(String[] args) {

        Tractor vehicle = new Tractor("blue", 10,100);
        Tractor vehicle1 = new Tractor("black",12,200);

        vehicle.startDriving();
        vehicle1.startDriving();
    }
}
