import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurmo on 4.04.2017.
 */

public class main {
    public static final int PREMIUM_PRICE = 4;
    public static final int BASIC_PRICE = 3;
    static List<Film> filmList = new ArrayList<Film>();
    static List<Film> availableFilmList = new ArrayList<Film>();
    static List<Customer> customerList = new ArrayList<Customer>();

    public static void main(String[] args) throws IOException {
        newCustomer("Kurmo Rootsi");
        System.out.println("Current bonus points: " + assignCustomerByName("Kurmo Rootsi").getBonusPoints());
        addFilm("Pahad Poisid", 1);
        addFilm("Head Poisid", 2);
        System.out.println("Film name is: " + filmList.get(0).getName());
        System.out.println(filmList.get(getIndex("Head Poisid")).changeType(1));
        System.out.println("Film index is: " + getIndex("Pahad Poisid"));
        listStore();
        rentFilm("Pahad Poisid", 5, assignCustomerByName("Kurmo Rootsi"));
        System.out.println("Current bonus points: " + assignCustomerByName("Kurmo Rootsi").getBonusPoints());
        listStore();
        removeFilm("Halvad Poisid");
        returnFilm("Pahad Poisid");
        listStore();
        rentFilm("Head Poisid", 3, assignCustomerByName("Kurmo Rootsi"));
        returnFilmLate("Head Poisid", 5);

    }

    public static void newCustomer(String name) {
        customerList.add(new Customer(name));
    }

    public static Customer assignCustomerByName(String name) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getName().equals(name)) {
                int index = i;
                return customerList.get(index);
            }
        }
        return null;
    }

    public static void addFilm(String filmName, int type) {
        filmList.add(new Film(filmName, type));
        availableFilmList.add(new Film(filmName, type));
    }

    public static void rentFilm (String filmName, int days, Customer name) throws IOException {
        for (int i = 0; i < availableFilmList.size(); i++) {
            if (availableFilmList.get(i).getName().equals(filmName)) {
                int type = availableFilmList.get(getIndex(filmName)).getType();
                String typeName = availableFilmList.get(getIndex(filmName)).getTypeName(type);
                int price = 0;
                availableFilmList.remove(getIndex(filmName));
                name.addPoints(type);
                price = calculatePrice(days, type);
                int bonusValue = name.getBonusPoints() / 25;
                if (type == 1 && bonusValue >= 1) {
                    int bonusPoints = bonusValue * 25;
                    int bonusMoney = bonusValue * 4;
                    price -= bonusMoney;
                    System.out.println(filmName + "(" + typeName + ") " + days + " days " + " (Paid with " + bonusPoints + " points) " + price + " EUR");
                } else {
                    System.out.println(filmName + "(" + typeName + ") " + days + " days " + price + " EUR");
                }
            }
            else System.out.println("The film is not available to rent!");
            return;
        }
    }

    public static int calculatePrice (int days, int type) {
        int price = 0;
        if (type == 1) {
            price = PREMIUM_PRICE * days;
        } else if (type == 2) {
            if (days > 3) {
                price = BASIC_PRICE + ((days - 3)*BASIC_PRICE);
            } else price = BASIC_PRICE;
        } else if (type == 3) {
            if (days > 5) {
                price = BASIC_PRICE + ((days - 5)*BASIC_PRICE);
            } else price = BASIC_PRICE;
        }
        return price;
    }

    public static void returnFilmLate(String filmName, int days) throws IOException {
        int type = filmList.get(getIndex(filmName)).getType();
        String typeName = filmList.get(getIndex(filmName)).getTypeName(type);
        int price = calculatePrice(days, type);
        availableFilmList.add(new Film(filmName, type));
        System.out.println(filmName + "(" + typeName + ") " + days + " extra days " + price + " EUR");
    }

    public static void returnFilm(String filmName) throws IOException {
        int type = filmList.get(getIndex(filmName)).getType();
        availableFilmList.add(new Film(filmName, type));
    }

    public static void removeFilm(String filmName) throws IOException{
        for (int i = 0; i < filmList.size(); i++) {
            if (filmList.get(i).getName().equals(filmName)) {
                filmList.remove(getIndex(filmName));
            }
            else System.out.println("The film you are trying to remove does not excist in the list!");
            return;
        }
    }

    public static int getIndex(String name) throws IOException {
        int index = -1;
        for (int i = 0; i < filmList.size(); i++) {
            if (filmList.get(i).getName().equals(name)) {
                return index = i;
            }
        }
        throw new IOException("The film is not added!");
    }

    public static void list() {
        System.out.println("Total list of films:");
        for (int i = 0; i < filmList.size(); i++) {
            System.out.println(filmList.get(i).getName());
        }
    }

    public static void listStore() {
        System.out.println("Current list of films in store:");
        for (int i = 0; i < availableFilmList.size(); i++) {
            System.out.println(availableFilmList.get(i).getName());
        }
    }
}
