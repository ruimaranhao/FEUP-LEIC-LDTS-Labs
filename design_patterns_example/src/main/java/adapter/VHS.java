package adapter;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class VHS {
    boolean VHSplaying;

    public VHS() {
        VHSplaying = false;
    }
    public void playVHS() {
        VHSplaying = true;
        System.out.println("VHS is playing on the TV");
    }
}
