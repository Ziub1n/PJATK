package PPJ.PPj23_Task1_2_3_4_5;

public class Person {
    private String name;
    private String surname;
    private String phoneNumber;


    Person(String name, String surname, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
