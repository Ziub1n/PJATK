package PPJ.PPj20;

public class Ball {
    private double radius;
    static int ballCounter = 0;

    Ball(double radius){
        this.radius = radius;
        ballCounter++;
    }

    static Ball makeBall(){

        double radius = Math.random()*(20-10)+10;
        Ball ball = new Ball(radius);

        return ball;
    }
    static void showCounter(){
        System.out.println(ballCounter+" elements have been created");
    }
}
