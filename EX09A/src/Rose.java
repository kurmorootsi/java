import java.util.List;

/**
 * Created by Kurmo on 20.03.2016.
 */
public class Rose extends Flower {
    private boolean trueFalse;

    public Rose(double rosePrice, boolean trueF) {
        super.setPrice(rosePrice);
        this.trueFalse = trueF;
    }
    public boolean hasThorns () {
        return trueFalse;
    }
    public static Rose findMostExpensiveThornyRose(List<Flower> flowers) {
        double minPrice = 0;

        Rose r = null;
        for (int i = 0; i < flowers.size(); i++) {
                if (flowers.get(i) instanceof Rose && ((Rose) flowers.get(i)).hasThorns()) {
                    if (minPrice < flowers.get(i).getPrice()) {
                        minPrice = flowers.get(i).getPrice();
                        r = (Rose) flowers.get(i);
                    }
                }
        }
        return r;
    }

}