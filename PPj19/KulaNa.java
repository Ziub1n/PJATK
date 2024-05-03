package PPJ.PPj19;


class KulaNa {



    private int promien;

    KulaNa(){
        this.promien = 5;
    }

    public KulaNa(Kwadrat kwadrat) {
        this.promien = kwadrat.getBok() / 2;
    }

    public KulaNa(Walec walec) {
        this.promien = walec.getPromien();
    }
    public KulaW  czyOpisanaNaSzescianie(Kwadrat kwadrat) {
        boolean czyOpisana = (promien == kwadrat.getBok() / 2);

        if(czyOpisana){
            System.out.println("\t\t-->kula moze byc opisana na tym szescianie<--\t\t");
        }else{
            System.out.println("\t\t-->kula nie moze byc opisana na tym szescianie<--\t\t");
        }
        return null;
    }


    public KulaW czyOpisanaNaWalcu(Walec walec) {
        boolean czyOpisana =(promien == walec.getWysokosc() / 2);

        if(czyOpisana){
            System.out.println("\t\t-->kula moze byc opisna na tym walcu<--\t\t");
        }else{
            System.out.println("\t\t-->kula nie moze byc opisana na tym walcu<--\t\t");
        }

        return null;
    }


    }
