package PPJ.PPj22_Task1;

public class Prism extends Triangle{

    private int height;

    public Prism(int side,int height){
        super(side);
        this.height = height;
    }

    @Override
    public double countArea() {
        return (int)(super.countArea()*2+3*this.height);
    }
    @Override
    public void showArea() {
        System.out.println("Area of prism :"+ (int)countArea());
    }
    public void showVolume(){
        System.out.println("Volume of prism: "+(int)super.countArea()*this.height);
    }
}
