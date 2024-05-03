package PPJ.PPj22_Task4_i_Task5;

public class LeafyTree extends Tree{

    int leafShape;



    LeafyTree(boolean greenForEver, int height, String sectionOfTree,int leafShape){
        super(greenForEver,height,sectionOfTree);
        this.leafShape = leafShape;
    }

    @Override
    public String toString() {
        return "----Leafy tree---- "+super.toString()+", "+this.leafShape;
    }
}
