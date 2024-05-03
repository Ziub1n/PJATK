package PPJ.PPj22_Task4_i_Task5;

public class FruitTree extends Tree{
    String fruitName;

    FruitTree(boolean greenForEver,int height,String sectionOfTree,String fruitName){
        super(greenForEver, height, sectionOfTree);
        this.fruitName = fruitName;

    }

    @Override
    public String toString() {
        return "----Fruit tree----"+super.toString()+", "+this.fruitName;
    }
}
