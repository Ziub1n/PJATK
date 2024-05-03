package PPJ.Car;

public class Car extends Exception {
    private int fuelStatus;
    private int distanceDriven;


    Car() {
        this.fuelStatus = 35;
        this.distanceDriven = 0;
    }

    public void fill(){
        int[] arr = new int[1];
        double result = Math.random() * 10;

            if ((int) result == 1) {
                throw new Explosion("BOOM!");
            }
            int range = (35 - 15) + 1;
            double fillTheGas = (int) (Math.random() * range) + 15;
            this.fuelStatus += fillTheGas;

    }

    public void drive100km() throws NotEnoughGas {

        if (this.fuelStatus < 10) {
            throw new NotEnoughGas("out of gas!");
        } else {
            this.distanceDriven += 100;
            this.fuelStatus -= 10;
            System.err.println(this.distanceDriven + "km driven, " + this.fuelStatus + " liters left");
        }

    }

}
