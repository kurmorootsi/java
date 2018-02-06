/**
 * Created by Kurmo on 27.09.2016.
 */
import java.lang.Math;

public class kodutoo {
    public static void main(String [] args) {
        ruuduPindala(3);
        hotOrCold(30);
        raise();
    }
    public static void ruuduPindala(int x) {
        System.out.println("Ruudu pindala on: " + Math.pow(2*x,2));
        System.out.println("Ruudu ümbermõõt on: " + (x*2)*4);
        System.out.println("Ringi pindala on: " + Math.PI * Math.pow(x,2));
        System.out.println("Ringi ümbermõõt on: " + 2 * Math.PI * x);
    }
    public static void hotOrCold(int x) {
        String answer;
        if (x > 25) {
            answer = "hot!";
        } else if (x < 10) {
            answer = "cold!";
        } else {
            answer = "warm!";
        }
        System.out.println(answer);
    }

    public static void raise() {
        int[] intArray = new int[4];
        intArray[0] = 900;
        intArray[1] = 1200;
        intArray[2] = 100;
        intArray[3] = 3000;
        for (int k = 0; k < intArray.length ; k++ ) {
            if (intArray[k] < 1000) {
                intArray[k] += (5*intArray[k]/100);
                System.out.println("Palgatõus on 5%: " + intArray[k]);
            }
            else
                System.out.println("Palgatõusu pole: " + intArray[k]);
        }
    }

}
