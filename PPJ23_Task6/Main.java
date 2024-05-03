package PPJ.PPJ23_Task6;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Fruit[] fruits = new Fruit[100];
        double sumOfWeight = 0;
        int i = 0;
        while (sumOfWeight < 5000) {
            Fruit fruitsInArray = tree.cutFruit();
            fruits[i] = fruitsInArray;
            sumOfWeight += fruitsInArray.getWeight();
            i++;
        }

        int numberOfApples = 0;
        int numberOfOranges = 0;
        int numberOfGrapes = 0;
        for (int j = 0; j < i; j++) {
            if (fruits[j] instanceof Apple) {
                numberOfApples++;
            } else if (fruits[j] instanceof Orange) {
                numberOfOranges++;
            } else if (fruits[j] instanceof Pear) {
                numberOfGrapes++;
            }
        }

        System.out.println("number of apples: " + numberOfApples);
        System.out.println("number of oranges: " + numberOfOranges);
        System.out.println("number of grapes: " + numberOfGrapes);
    }
}


