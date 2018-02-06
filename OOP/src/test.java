/**
 * Created by Kurmo on 14.09.2016.
 */

public class test {
    public static void main(String[] args) {
        System.out.println("tere");

        double arv = Math.random();
        System.out.println(arv);
        double reaalJuhuarv = Math.random()*5+15;
        System.out.println(reaalJuhuarv);
        int a = (int)(Math.random()*1000-50);
        System.out.println(a);

        int b = 7;
        if (b % 2 == 0) {
            System.out.println("See arv on paaris");
        }
        else
            System.out.println("See arv ei ole paaris");
    }

}

