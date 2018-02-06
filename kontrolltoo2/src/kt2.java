/**
 * Created by Kurmo on 7.12.2016.
 */
public class kt2 {
    public static void main(String[] args){
        fulltime Kurmo = new fulltime("Kurmo", "IT", 396051432, 1000, 100);
        fulltime Rene = new fulltime("Rene", "Koristaja", 396012332, 1000, 100);
        fulltime Ilja = new fulltime("Ilja", "IT", 344051222, 1000, 100);
        parttime Denis = new parttime("Denis", "IT", 396123332, 70, 3);
        parttime Elias = new parttime("Elias", "IT", 396221431, 50, 4);

        System.out.println(Kurmo.getNimi());
        System.out.println(Rene.getAmet());
        System.out.println(Ilja.getIsikukood());
        Kurmo.changeAmet("Boss");
        System.out.println(Elias.calculatePalk());
        System.out.println(Denis.calculatePalk());
        System.out.println(Kurmo.calculateBonus());
        System.out.println(Rene.calculatePalk());

    }
}

