/**
 * Created by Kurmo on 7.12.2016.
 */
public class fulltime extends worker {
    protected double Palk;
    protected double Bonus;
    protected double Koefitsient;

    public fulltime(String nimi, String amet, int isikukood, double palk, double koefitsient){
        this.Amet = amet;
        this.Nimi = nimi;
        this.Isikukood = isikukood;
        this.Koefitsient = koefitsient;
        this.Palk = calculatePalk();
        this.Bonus = calculateBonus();
    }

    public double calculateBonus() {
        Bonus = Palk / 120;
        return Bonus;
    }

    public double calculatePalk() {
        double givenPalk = Palk + Koefitsient;
        return givenPalk;
    }
}
