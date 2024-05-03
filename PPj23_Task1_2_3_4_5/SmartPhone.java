package PPJ.PPj23_Task1_2_3_4_5;

public class SmartPhone extends MobileDevice {

    private Person[] friends = new Person[10];
    private int indexOfFriends = 0;


    void call(String number) {
        super.call(number);
    }

    void showHistoryOfCalls() {
        for (String nr : getLastCalls()) {
            if (nr != null) {
                boolean friendFound = false;
                for (Person person : friends) {
                    if (person != null && person.getPhoneNumber().equals(nr)) {
                        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getPhoneNumber());
                        friendFound = true;
                        break;
                    }
                }
                if (!friendFound) {
                    System.out.println(nr);
                }
            }
        }
    }
    void addFriend(String name, String surname, String number) {
        if (indexOfFriends < friends.length) {
            friends[indexOfFriends++] = new Person(name, surname, number);
        } else {
            System.out.println("you cant add more friends");
        }
    }
}
