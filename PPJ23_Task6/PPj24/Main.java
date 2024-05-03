package PPJ.PPJ23_Task6.PPj24;


public class Main {
    public static void main(String[] args) throws CipkaException {

        String[] chuj = {"chuj w cipce","chuj nie w cipce"};
        try {
            double czyChujWCipce = Math.random()*10;

            if((int)czyChujWCipce>4){
                chuj[2]="smutny chuj";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new CipkaException();
        }finally {
            double raffle = Math.random() * 10;

            if((int)raffle>5) {
                System.out.println(chuj[0]);
                System.out.println("cipka jest mokra");
            }else{
                System.out.println(chuj[1]);
                System.out.println("sucha cipka");
            }

        }


    }


}

