package PPJ.PPJ12;

public class Task5 {
    public static void main(String[] args) {

        int [ ] arr = { 153 , 333 , 370 , 515 , 407 , 80};
        int num=2,sum=0,counter=0,i=0,tempForCounter=arr[i],b=arr[i];
        for ( ; i < arr.length; i++) {
            do{
                tempForCounter/=10;
                counter++;
            }while(tempForCounter>0);

            while (num > 1) {
                num = b % 10;
                sum = (int) Math.pow(num, counter) + sum;
                b /= 10;
            }
            if (sum == arr[i]) {
                System.out.println(arr[i]+" is Armstrong number");
            } else {
                System.out.println(arr[i]+"  isn't armstrong number");
            }
        }



    }
}
