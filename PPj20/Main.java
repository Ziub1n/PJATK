package PPJ.PPj20;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nTask1\n");

        for (int i = 0; i < 11; i++) {
            Ball.makeBall();
        }
        Ball.showCounter();

        System.out.println("\nTask2\n");

        Person p1 = new Person("Wojtek");
        Person p2 = new Person("Bartek", 1992);
        Person p3 = new Person("Kacper",2003);
        Person p4 = new Person("Michal",1945);

        Person[] people ={p1,p2,p3,p4};

        System.out.println(p1.getName()+" is "+p1.getAge()+" years old");
        System.out.println(p2.getName()+" is "+p2.getAge()+" years old");
        System.out.println(p3.getName()+" is "+p3.getAge()+" years old");
        System.out.println(p4.getName()+" is "+p4.getAge()+" years old");


        System.out.println("Who is older "+p1.getName()+" or "+p2.getName()+" ?: "+Person.getOlder(p1,p2).getName());

        System.out.println("the oldest person is: "+ Person.getOldest(people).getName());

        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        System.out.print("People sorted from the oldest to youngest : ");
        System.out.print("[ ");
        for (Person val : people){
            System.out.print(val.getName()+" ");
        }
        System.out.print(" ]");

        System.out.println("\nTask3\n");

        String[] a = {"PSG", "Atletico Madryt", "Sporting CP", "Inter",
                "Benica", "Villarreal", "RB Salzburg", "Chelsea"};
        String[] b = {"Manchester City", "Liverpool", "Ajax Amsterdam",
                "Real Madryt", "Bayern Monachium", "Manchester United", "Lille", "Juventus"};

        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < a.length; i++) {
            myQueue.put(a[i]);
            myQueue.put(b[i]);
        }

        while (myQueue.size()!=0){
            System.out.println(myQueue.get()+" vs "+myQueue.get());
        }

        System.out.println("myQueue.size() = " + myQueue.size());




    }
}
