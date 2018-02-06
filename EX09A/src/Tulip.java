import java.util.List;

/**
 * Created by Kurmo on 20.03.2016.
 */
public class Tulip extends Flower {

    /**
     * Colour of given Tulip.
     */
    private String colour;

    /**
     * Constructor
     * @param tulipPrice price of tulip.
     * @param tColour colour of tulip.
     */
    public Tulip(double tulipPrice, String tColour) {
        super.setPrice(tulipPrice);
        colour = tColour;
    }

    /**
     * @return colour of the tulip.
     */
    public String getColour() {
        return colour;
    }
    public static double getTotalPriceOfTulipsWithColour(List<Flower> flowers, String colour) {
        double totalPrice = 0;
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i) instanceof Tulip) {
                if (colour.equals(((Tulip) flowers.get(i)).getColour())) {
                    totalPrice += flowers.get(i).getPrice();
                }
            }
        }
        return totalPrice;
    }

}