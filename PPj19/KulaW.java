package PPJ.PPj19;

public class KulaW {

    private int wysokosc;
    private int promien;

    KulaW(){
        this.promien = 5;
    }

    public KulaW(Kwadrat kwadrat) {
        this.wysokosc = kwadrat.getBok();
        this.promien = kwadrat.getBok() / 2;
    }

    public KulaW(Walec walec) {
        this.wysokosc = walec.getWysokosc();
        this.promien = walec.getPromien();
    }


    public KulaW czyMiesciSieWWalcu(Walec walec) {
        boolean isFalse= promien <= walec.getPromien() && wysokosc <= walec.getWysokosc();
        if(isFalse){
                System.out.println("\t\t-->kula miesci sie w walcu<--\t\t");
        }else{
                System.out.println("\t\t-->kula nie miesci sie w walcu<--\t\t");
        }
        return null;
    }

    public KulaW czyMiesciSieWSzescianie(Kwadrat kwadrat){
        boolean isTrue = promien * 2 <= kwadrat.getBok();
        if (isTrue) {
             System.out.println("\t\t-->kula mieści się w sześcianie<--\t\t");
        } else {
            System.out.println("\t\t-->kula nie mieści się w sześcianie<--\t\t");
        }
        return null;
    }
    public double getPromien(){
        return promien;
    }


    public void show(){
        double poleKuli = 4*Math.PI*Math.pow(promien,2);
        System.out.println("\t~ pole kuli: "+(int)poleKuli);
        double objetoscKuli= (4 / 3) * (Math.PI)*promien*promien*promien;
        System.out.println("objetosc ");
        System.out.println("\t~ objetosc kuli: "+objetoscKuli);
    }

}


