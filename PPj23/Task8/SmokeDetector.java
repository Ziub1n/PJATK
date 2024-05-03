package PPJ.PPj23.Task8;

public class SmokeDetector {
    private boolean smokeDetected;

    public SmokeDetector(boolean smokeDetected) {
        this.smokeDetected = smokeDetected;
    }

    public boolean isSmokeDetected()  {
        if(smokeDetected) {
            throw new Alarm();
        }
        return smokeDetected;
    }
}
