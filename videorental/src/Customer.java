import java.util.ArrayList;

/**
 * Created by Kurmo on 4.04.2017.
 */
public class Customer {
    String name;
    int bonusPoints;
    ArrayList<String> rentedFilms = new ArrayList<String>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public boolean addPoints(int type) {
        if (type == 1) {
            this.bonusPoints += 2;
        }
        else this.bonusPoints += 1;
        return true;
    }

    public boolean removePoints(int points) {
        this.bonusPoints -= points;
        return true;
    }
}
