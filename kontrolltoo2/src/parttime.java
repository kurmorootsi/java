/**
 * Created by Kurmo on 7.12.2016.
 */
public class parttime extends worker {
    protected double Tunnitasu;
    protected int Tunnid;

    public parttime(String nimi, String amet, int isikukood, int tunnid, double tunnitasu){
        this.Amet = amet;
        this.Nimi = nimi;
        this.Isikukood = isikukood;
        this.Tunnitasu = tunnitasu;
        this.Tunnid = tunnid;
    }

    public double calculatePalk() {
        double palk = this.Tunnid * this.Tunnitasu;
        return palk;
    }
}
