package PPJ.PPj22_Task3;

public class Tractor extends WheeledVehicle{

    int weight;

    Tractor(String color, int numberOfAxles, int weight){
        super(color,numberOfAxles);
        this.weight = weight;
    }
    public void startDriving(){
        if(this.weight/getNumberOfAxles()>11){
            System.out.println("Dangerous driving, refusal to start the engine");
        }else{
            System.out.println("Ready to go, starting engine");
        }
    }
}
