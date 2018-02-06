/**
 * Created by Kurmo on 12.10.2016.
 */
public class pangakaart {
    private double balance;
    private String ID;
    private String cardType;

    public double getBalance() {
        return balance;
    }

    public void setCardType(String type){
        this.cardType = type;
    }

    public void setID(String givenID) {
        this.ID = givenID;
    }

    public Boolean validateID() {
        if (ID.length() == 10) {
            return true;
        } else
            return false;
    }

    public String getInfo() {
        String info = "Kontol on raha: " + balance + " Konto ID: " + ID + " Konto tüüp on: " + cardType;
        return info;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = amount;
            return;
        }
    }

    public double payment(double amount) {
        if (balance >= amount) {
            if (cardType == "tudeng"){
                double soodustus = (3*amount)/100;
                balance = balance - amount + soodustus;
            }
            else {
                balance = balance - amount;
            }
            return balance;
        } else {
            return Double.NaN;
        }
    }
}
