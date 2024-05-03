package PPJ.PPj22_Task1;

public class Pyramid extends Triangle {

    private int longerSite;
    private int height;
    private int heightOfSide;

    public Pyramid(int side, int longerSite, int height,int heightOfSide){
        super(side);
        this.longerSite = longerSite;
        this.height = height;
        this.heightOfSide = heightOfSide;
    }

    @Override
    public double countArea(){
        return super.countArea() + 3*0.5*getSide()* this.heightOfSide;
    }
    @Override
    public void showArea() {
        System.out.println("Area of pyramid: "+ (int)countArea());
    }
    public void showVolume(){
        System.out.println("Volume of pyramid: "+(int)(0.33333*super.countArea()*this.longerSite));
    }


}
