package PPJ.PPj23_Task1_2_3_4_5;

public class MobileDevice extends Phone {

    private String[] lastCalls = new String[10];
    private int index = 0;

    void call(String number) {
        super.call(number);
        if (index < 10) {
            lastCalls[index++]=number;
        }
    }

    @Override
    void showHistoryOfCalls() {
        for (String nr : lastCalls) {
            if (nr != null) {
                System.out.println(nr);
            }
        }
    }

    public String[] getLastCalls() {
        return lastCalls;
    }
}