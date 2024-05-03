package PPJ.PPJ15;

public class Task5 {
    public static void main(String[] args) {

            char arr[] = {'A','l','a',' ','m','a',' ','k','o','t','a'};



        howMany(arr);


    }
    public static void howMany(char arr[]) {

        int counter = 0,c=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                c++;
                System.out.println("liczba liter w "+ (c>1? "drugim" :"pierwszym")+" slowie: "+counter);
                counter=0;
            }else{
                counter++;
            }
        }
        System.out.println("liczba liter w trzecim slowie: "+counter);

    }
}
