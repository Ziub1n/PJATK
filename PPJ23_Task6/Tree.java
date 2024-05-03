package PPJ.PPJ23_Task6;

public class Tree {

    public Fruit cutFruit(){

        int raffle = (int)(Math.random() * 3);
        switch (raffle) {
            case 0:
                return new Pear();
            case 1:
                return new Apple();
            case 2:
                return new Orange();
            default:

        }      return null;
    }
}
