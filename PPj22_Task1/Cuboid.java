package PPJ.PPj22_Task1;

public class Cuboid extends Rectangle{

    private int depth;

    Cuboid (int height , int width, int depth){
        super(height,width);
        this.depth = depth;
    }


    @Override
    public void showArea() {
        System.out.println("Area of Cuboid : "+2 * getHigh()*getWidth()+2*getHigh()*depth+2*getWidth()*depth);
    }
}
