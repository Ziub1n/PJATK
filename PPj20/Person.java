package PPJ.PPj20;

public class Person {

    private String name;
    private int birthYear;

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    Person(String name) {
        this.name = name;
        this.birthYear = 1990;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2022 - birthYear;
    }

    public static Person getOlder(Person p1, Person p2) {
        return p1.getAge() > p2.getAge() ? p1 : p2;
    }

    public static Person getOldest(Person[] people) {
        Person oldestPerson = people[0];
        for (int i = 0; i < people.length-1; i++) {
            oldestPerson = getOlder(oldestPerson, people[i]);
        }
        return oldestPerson;
    }
}