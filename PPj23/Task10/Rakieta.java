package PPJ.PPj23.Task10;

public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj() {
        System.out.println(wagaPaliwa);
        double tankowanie = (int)(Math.random() * 1000);
        wagaPaliwa += tankowanie;
        System.out.println(tankowanie+" litrow zostalo zatankowane");
    }

    public void start() throws Exception {
        if (wagaPaliwa < 1000) {
            throw new Exception("start anulowany - za mało paliwa");
        }
        System.out.println("Procedura startowa wrrrrruuum");
    }
}
