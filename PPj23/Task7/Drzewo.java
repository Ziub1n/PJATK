package PPJ.PPj23.Task7;

public class Drzewo {
    String nazwa;
    String owoc;
    int wysokosc;

    Drzewo(String nazwa, String owoc, int wysokosc){
        this.nazwa = nazwa;
        this.owoc = owoc;
        this.wysokosc = wysokosc;
    }
    void pokazInfo(){
        System.out.println("**"+this.nazwa+"** owoc: "+this.owoc+", wysokość: "+this.wysokosc);
    }
    void zerwijOwoc(){
        if(this.owoc.equals("")){
            System.out.println("DrzewoBezOwocoweException");
        }else{
            System.out.println(this.owoc+ " zostaly zerwane");
        }
    }

}
