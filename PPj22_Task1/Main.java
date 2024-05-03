package PPJ.PPj22_Task1;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,8);
        rectangle.showArea();
        System.out.println("-------------------------------");

        Rectangle cuboid = new Cuboid(2,3,1);
        cuboid.showArea();
        System.out.println("-------------------------------");

        Triangle triangle = new Triangle(5);
        triangle.showArea();
        triangle.countArea();
        System.out.println("-------------------------------");

        Pyramid pyramid = new Pyramid(5,12,30,10);
        pyramid.showArea();
        pyramid.countArea();
        pyramid.showVolume();


        System.out.println("-------------------------------");
        Prism prism = new Prism(5,10);
        prism.showArea();
        prism.countArea();
        prism.showVolume();





    }
}
