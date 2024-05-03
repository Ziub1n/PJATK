package PPJ.PPj22_Task1;

public class Rectangle {

    private int height;
    private int width;

    Rectangle(int height, int width){
        this.height = height;
        this.width = width;

    }

    public int getHigh() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void showArea(){
        System.out.println("Area of rectangle : "+this.height*this.width);
    }



}
