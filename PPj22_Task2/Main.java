package PPJ.PPj22_Task2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Welder("Jackob",5);
        Person person2 = new Welder("Max",1);
        Person person3 = new Welder("Jake",3);

        System.out.println("Person 1: "+person1.show());
        System.out.println("Person 2: "+person2.show());
        System.out.println("Person 3: "+person3.show());
    }
}
