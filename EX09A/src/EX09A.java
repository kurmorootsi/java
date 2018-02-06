/**
 * Created by Kurmo on 20.03.2016.
 */
import java.util.ArrayList;
import java.util.List;

public class EX09A {

    public static void main(String[] args) {
        Rose r1 = new Rose(10, true);
        Rose r2 = new Rose(32, true);
        Rose r3 = new Rose(13, true);
        Tulip t1 = new Tulip(10, "Pink");
        Tulip t2 = new Tulip(10, "Pink");
        Tulip t3 = new Tulip(10, "Roheline");

        List<Flower> flowers = new ArrayList<Flower>();

        flowers.add(r1);
        flowers.add(t3);
        flowers.add(t2);

        System.out.println(Rose.findMostExpensiveThornyRose(flowers).getPrice());
        System.out.println(Tulip.getTotalPriceOfTulipsWithColour(flowers, "Pink"));

    }
}