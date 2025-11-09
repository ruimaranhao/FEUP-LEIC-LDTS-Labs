package adapter;

/**
 * Created by jahnaariellegoldman on 8/2/16.
 */
public class VHSAdapter extends DVD {
    VHS vhs;
    public VHSAdapter(VHS vhs) {
        this.vhs = vhs;
        dvdPlaying = vhs.VHSplaying;
    }
    public void playDVD() {
        vhs.playVHS();
        dvdPlaying = true;
    }
}
