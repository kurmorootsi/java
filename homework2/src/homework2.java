import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurmo on 1.11.2016.
 */
public class homework2 {
    static List<Kangelane> Kangelased = new ArrayList<Kangelane>();
    public static void main(String[] args) throws IOException {
        readFile();
        System.out.println(Kangelased);
        for (Kangelane p : Kangelased){
            p.päästa(100); //Kõik väljad tulevad 95 päästetud, sest Superkangelasel pole sisestatud osavust.
        }
    }

    public static boolean createSuperman(String nimi, String asukoht) {
        Kangelased.add(new SuperKangelane(nimi, asukoht));
        return true;
    }

    public static boolean createNonSuperman(String nimi, String asukoht) {
        Kangelased.add(new Kangelane(nimi, asukoht));
        return true;
    }

    public static void readFile() throws IOException {
        try {
            File file = new File("kangelased.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("*")) {
                    String[] parts = line.split("*/");
                    String nimi = parts[0];
                    String asukoht = parts[1];
                    createSuperman(nimi, asukoht);
                } else {
                    String[] parts = line.split("/");
                    String nimi = parts[0];
                    String asukoht = parts[1];
                    createNonSuperman(nimi, asukoht);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}