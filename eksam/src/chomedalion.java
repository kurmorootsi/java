import java.util.Date;

/**
 * Created by Kurmo on 16.01.2017.
 */
public class chomedalion {
    protected final String nimi = "chomedalion";
    protected final String kaal = "0.02g";
    protected Date time;
    protected String pictureFile;
    public boolean Packed;

    public chomedalion(Date date){
        this.time = date;
    }

    public boolean isPacked() {
        return Packed;
    }

    public boolean pack() {
        Packed = true;
        return true;
    }

    public boolean setPicture(String pictureFile){
        this.pictureFile = pictureFile;
        return true;
    }
}
