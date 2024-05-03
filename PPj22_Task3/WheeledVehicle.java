package PPJ.PPj22_Task3;

public class WheeledVehicle extends Vehicle{

    private int numberOfAxles;
    WheeledVehicle(String color, int numberOfAxles){
        super(color);
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
}
