import java.util.Random;

/**
 * Created by Kurmo on 1.11.2016.
 */
public class SuperKangelane extends Kangelane {
    public SuperKangelane(){
    }

    public SuperKangelane(String nimi, String asukoht){
        this.asukoht = asukoht;
        this.nimi = nimi;
    }
    private double osavus;

    public void setOsavus(){
        Random rand = new Random();
        int randomNumber = 1 + rand.nextInt((5 - 1) + 1);
        osavus = randomNumber;
        System.out.println("Osavus seadistatud: " + osavus);
    }

    public void päästa(int arv) {
        double saved = arv * ((95 + osavus)/100);
        System.out.println("Päästetud inimesi: " + saved);
    }
}
