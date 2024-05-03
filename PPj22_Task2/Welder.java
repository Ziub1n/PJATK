package PPJ.PPj22_Task2;

public class Welder extends Person{

    private int jobSeniority;

    public Welder(String name ,int jobSeniority){
        super(name);
        this.jobSeniority = jobSeniority;
    }

    @Override
    public String show() {
        return super.show()+", Job seniority- "+this.jobSeniority;
    }
}
