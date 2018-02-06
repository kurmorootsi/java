/**
 * Created by Kurmo on 8.12.2016.
 */
public class kodutoo3 {
    public static void main(String[] args) {
        indiabanaan banaan1 = new indiabanaan(30, 0.5, 3, "Panama", 5);
        indiabanaan banaan2 = new indiabanaan(60, 0.1, 2, "Panama", 5);
        indiabanaan banaan3 = new indiabanaan(50, 0.2, 1, "Panama", 1);
        indiabanaan banaan4 = new indiabanaan(45, 0.3, 3, "Panama", 2);
        indiabanaan banaan5 = new indiabanaan(12, 0.5, 4, "Panama", 4);
        indiabanaan banaan6 = new indiabanaan(10, 0.23, 1, "Panama", 5);
        indiabanaan banaan7 = new indiabanaan(25, 0.22, 3, "Panama", 2);

        poebanaan banaan8 = new poebanaan(0.5, 3, "Tavaline", 5);
        poebanaan banaan9 = new poebanaan(0.1, 4, "Tavaline", 5.1);
        poebanaan banaan10 = new poebanaan(0.3, 7, "Tavaline", 1.1);

        System.out.println(banaan1.arvutaHind());
        System.out.println(banaan2.arvutaSäilivus());

    }
}
