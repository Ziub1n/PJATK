package PPJ.PPj19;

public class Word {
    char[]arr;
    int sth;

    Word(){
        this.arr = new char[100];
        this.sth =0;
    }
    public void addChar(char x){
        arr[sth]=x;
        sth++;
    }
    public void show(){

        System.out.println(arr);
    }
    public int length(){

        return  sth;
    }
}
