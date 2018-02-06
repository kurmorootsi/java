/**
 * Created by Kurmo on 1.11.2016.
 */
public class Kangelane {
    protected String nimi;
    protected String asukoht;

    public Kangelane(){
    }
    protected Kangelane(String nimi, String asukoht) {
        this.nimi = nimi;
        this.asukoht = asukoht;
    }

    public void setNimi(String gNimi) {
        nimi = gNimi;
    }

    public void setAsukoht(String gAsukoht) {
        asukoht = gAsukoht;
    }

    public String getNimi() {
        System.out.println("Nimi: " + nimi);
        return nimi;
    }

    public String getAsukoht() {
        System.out.println("Asukoht: " + asukoht);
        return asukoht;
    }

    public void päästa(int arv) {
        double saved = arv * 0.95;
        System.out.println("Päästetud inimesi: " + saved);
    }
}

