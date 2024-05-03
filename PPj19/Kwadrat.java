package PPJ.PPj19;

public class Kwadrat {
    private int bok;

    Kwadrat(int bok){
        this.bok = bok;
    }
    public void show(){
        double poleKwadratu =Math.pow(bok,2);
        System.out.println("\t~pole kwadratu: "+(int)poleKwadratu);
        double objetoscSzescianu =Math.pow(bok,3);
        System.out.println("\t~objetosc szescianu: "+(int)objetoscSzescianu);
    }
    public int getBok(){
        return bok;
    }

}
