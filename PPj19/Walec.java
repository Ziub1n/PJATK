package PPJ.PPj19;

public class Walec {
    private int promien;
    private int wysokosc;

    Walec(int promien,int wysokosc){
        this.promien = promien;
        this.wysokosc = wysokosc;
    }
    public void show(){

        double pPodstawy = Math.PI * Math.pow(promien,2);

        System.out.println("\t~pole podstawy walca: "+(int)pPodstawy);
        System.out.println("\t~objetosc walca : "+(int)pPodstawy*wysokosc);
    }
    public int getWysokosc(){
        return wysokosc;
    }
    public int getPromien(){
        return promien;
    }
}
