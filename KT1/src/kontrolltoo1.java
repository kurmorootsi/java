/**
 * Created by Kurmo on 12.10.2016.
 */
public class kontrolltoo1 {
    public static void main(String[] args){

        System.out.println("KT1, Kurmo Rootsi, Variant B");


        tudengikaart Kurmo = new tudengikaart();
        Kurmo.setCardType("tudeng");
        teachersCard Viivian = new teachersCard();

        Kurmo.addMoney(300);
        Viivian.addMoney(300);

        Kurmo.openBottle("õlle");
        Viivian.setAmetiKoht("õpetaja");
        System.out.println(Viivian.getAmetiKoht());

        Viivian.payment(100);
        Kurmo.payment(100);

        System.out.println(Viivian.getBalance());
        System.out.println(Kurmo.getBalance());


    }
}
