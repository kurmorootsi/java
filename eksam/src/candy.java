import java.time.Instant;
import java.util.Date;

/**
 * Created by Kurmo on 16.01.2017.
 */
public class candy {
    protected String nimi;
    protected String kaal;
    protected Date time;
    public boolean Packed;

    public candy(String nimi, String kaal, Date date){
        this.kaal = kaal;
        this.nimi = nimi;
        this.time = date;
    }

    public boolean pack() {
        Packed = true;
        return true;
    }

    public boolean isPacked() {
        return Packed;
    }
}
