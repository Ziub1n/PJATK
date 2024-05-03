package PPJ.PPJ18;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] tab ={1,2,3,4,5,6,7,8};

        int source = -1;
        int destination =4;

        swap(tab,source,destination);

        System.out.println(Arrays.toString(tab));


    }
    public static void swap (int[]tab, int source, int destination){
        if(source>=0 && source < tab.length && destination < tab.length && destination>=0){
            int temp = tab[source];
            tab[source]= tab[destination];
            tab[destination]=temp;
        }else{
            System.out.println("wrong source or destination");
        }

    }
}
