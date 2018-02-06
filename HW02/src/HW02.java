import java.io.IOException;
/**
 * Homework 02 - Droptris AI.
 * https://courses.cs.ttu.ee/pages/ITI0011:HW02_Droptris
 */
public class HW02 {
    private static int columnA = 0;
    private static final int COLUMN_B = 6;
    private static final int COLUMN_AMAX = 4;
    public static void main(String[] args) {
        Configuration c = new Configuration(1, 1, 1);
        run(c.toString()); }
    public static int run(String connectionString) {
        try {
            // false - only "O" blocks are sent
            DroptrisConnection conn = new DroptrisConnection("kuroot", true);
            String line;
            line = conn.readLine();
            System.out.println(line);
            if (line == null) {
                System.out.println("no more blocks!");
            }
            while (line != null) {
                line = conn.readLine();
                System.out.println(line);
                if (line == null) {
                    System.out.println("no more blocks!"); }
                        else if
                            (line.equals("{\"block\": \"O\"}")) {
                                String result = boxes();
                                conn.sendAction(result);
                                System.out.println(conn.readScoreData()); }
                        else if
                            (line.equals("{\"block\": \"I\"}")) {
                                String result = lines();
                                conn.sendAction(result);
                                System.out.println(conn.readScoreData()); } }
            System.out.println("game over!");
            String scoreData = conn.readScoreData();
            String emptyInt = "";
            int score;
            for (int x = 0; x < scoreData.length(); x++) {
                char charAt = scoreData.charAt(x);
                if (Character.isDigit(charAt)) {
                    emptyInt += charAt;}}
            score = Integer.parseInt(emptyInt);
            return score; } catch (IOException e) {
            e.printStackTrace();}
        return 0; }
    private static String boxes() {
        String result;
        if (columnA > COLUMN_AMAX) {
            columnA = 0; }
        result = "{\"column\": " + columnA + ", \"rotation\": 0}";
        columnA += 2;
        return result; }
    private static String lines() {
        String result;
        result = "{\"column\": " + COLUMN_B + ", \"rotation\": 1}";
        return result; }
}
