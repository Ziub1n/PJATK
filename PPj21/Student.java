package PPJ.PPj21;

class Student {
    private int sNumber;
    private String name;

    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
    }

    public void show() {
        System.out.println("Numer indeksu: " + this.sNumber);
        System.out.println("Imię i nazwisko: " + this.name);
    }
}

