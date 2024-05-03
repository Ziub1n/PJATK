package PPJ.PPj22_Task4_i_Task5;

public class Tree {
    boolean greenForEver;
    int height;
    String sectionOfTree;

    Tree(boolean greenForEver, int height, String sectionOfTree){
        this.greenForEver = greenForEver;
        this.height = height;
        this.sectionOfTree = sectionOfTree;
    }
    public String toString(){
        return "Information :"+ this.greenForEver +", "+this.height+", "+this.sectionOfTree;
    }
}
