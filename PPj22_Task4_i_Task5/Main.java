package PPJ.PPj22_Task4_i_Task5;

public class Main {
    public static void main(String[] args) {

        ConiferTree coniferTree = new ConiferTree(false,6,"trunks",100000,0.2);
        LeafyTree leafyTree = new LeafyTree(false,10,"trunks",2);
        FruitTree fruitTree = new FruitTree(true,4,"trunks","apple");

       
        System.out.println(coniferTree);
        System.out.println(leafyTree);
        System.out.println( fruitTree);

    }
}
