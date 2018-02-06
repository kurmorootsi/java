/**
 * Created by Kurmo on 8.12.2016.
 */
public class poebanaan extends banaan{
    protected int Säilivus;

    public poebanaan(double kaal,int küpsustase,String sort,double baashind){
        this.Kaal = kaal;
        this.Küpsustase = küpsustase;
        this.Sort = sort;
        this.Baashind = baashind;
    }

    public int arvutaSäilivus(){
        Säilivus = 10 - Küpsustase;
        return Säilivus;
    }

    public double arvutaHind() {
        double hind = Baashind * Säilivus;
        if (Kaal > 0.2) {
            hind = hind * 0.05;
        }
        return hind;
    }

}
