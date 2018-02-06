import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Kurmo on 16.01.2017.
 */
public class kommid {
    public static String nimi;
    public static String kaal;
    static List<candy> Candy = new ArrayList<candy>();
    static List<chomedalion> Chomedalion = new ArrayList<chomedalion>();
   /*        tootke 2000 kommi “Kaseke”
             tootke 5000 kommi “Emmake”
             tootke 1550 šokolaadimedaljoni
             pakendage kõik senitoodetud maiustused
             tootke 4000 kommi “Valge biison”
             pakendage need*/


    public static void main(String[] args) throws IOException {
        readFile("kaseke.txt");
        turnOn();
        makeCandy(2000);

        readFile("emmake.txt");
        turnOn();
        makeCandy(5000);

        makeChomedalion(1550);

        packCandys();

        readFile("valgebiison.txt");
        turnOn();
        makeCandy(4000);

        packCandys();
        System.out.println("Send Nudes!");

    }

    public static void readFile(String fileName) throws IOException {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            line = bufferedReader.readLine();
            //while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(" ");
            nimi = parts[0];
            kaal = parts[1];
            //}
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void turnOn() throws IOException {
        writeLog("log: " + nimi + " " + kaal);
    }

    public static boolean makeCandy(int amount) throws IOException {
        Date date = new java.util.Date();
        for (int x = 0; x<amount; x++) {
            Candy.add(new candy(nimi, kaal, date));
        }
        writeLog("Kommi nimi: " + nimi + " " + "Kommide arv: " + amount + " " + "Tootmise aeg: " + date);
        return true;
    }

    public static boolean makeChomedalion(int amount) throws IOException {
        Date date = new java.util.Date();
        for (int x = 0; x<amount; x++) {
            Chomedalion.add(new chomedalion(date));
        }
        writeLog("Kommi nimi: Chomedalion" + " " + "Kommide arv: " + amount + " " + "Tootmise aeg: " + date);
        return true;
    }

    public static boolean packCandys() throws IOException {
        writeLog("About to start packing!");
        int x = 0;
        for (chomedalion p : Chomedalion) {
            if (!p.isPacked()) {
                p.pack();
                x++;
            }
        }
        for (candy p : Candy) {
            if (!p.isPacked()) {
                p.pack();
                x++;
            }
        }
        writeLog(x+" candys packed!");
        return true;
    }

    public static void writeLog(String text) throws IOException {
        try(FileWriter fw = new FileWriter("candylog.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(text);
        } catch (IOException e) {
        }
    }
}
