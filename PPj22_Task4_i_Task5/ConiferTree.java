package PPJ.PPj22_Task4_i_Task5;

public class ConiferTree extends Tree{
    int numberOfNeedles;
    double coneLength;

    ConiferTree(boolean greenForEver,int height,String sectionOfTree,int numberOfNeedles,double coneLength){
        super(greenForEver,height,sectionOfTree);
        this.numberOfNeedles = numberOfNeedles;
        this.coneLength = coneLength;

    }

    @Override
    public String toString() {
        return "----Confier tree----"+super.toString()+", "+this.numberOfNeedles+", "+this.coneLength;
    }
}
