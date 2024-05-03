package PPJ.PPj22_Task1;

public class Triangle {

    private int side;

    public Triangle(int side){
        this.side = side;
    }
    public double countArea(){
        return Math.pow(this.side,2)*Math.sqrt(3)/4;
    }
    public void showArea(){
        System.out.println("Area of triangle: "+(int)countArea());
    }
    public int getSide() {
        return side;
    }

}
