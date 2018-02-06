/**
 * Created by Kurmo on 8.12.2016.
 */
public class indiabanaan extends banaan{
    protected int Kõverus;

    public indiabanaan(int kõverus,double kaal,int küpsustase,String sort,double baashind){
        this.Kõverus = kõverus;
        this.Kaal = kaal;
        this.Küpsustase = küpsustase;
        this.Sort = sort;
        this.Baashind = baashind;
    }

    public double arvutaSäilivus(){
        int Säilivus = (10 - Küpsustase)/2;
        return Säilivus;
    }

    public double arvutaHind() {
        double hind = Baashind * arvutaSäilivus();
        if (Kaal > 0.2) {
            hind = hind * 0.05;
        }
        return hind;
    }
}
