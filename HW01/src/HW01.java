import java.util.Scanner;
import java.util.Random;

public class HW01 {

    private static final int CELL_EMPTY = 0;
    private static final int CELL_TREASURE = 1;
    private static final int CELL_FOUND = 2;
    private static final int CELL_OPENED = 3;
    private static final int CELL_ERROR = -1;
    private static int[][] MAP;
    private static int height = 3;
    private static int width = 3;
    private static int treasures = 1;


    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int[] parameters;
            String pattern = "^[1-9][0-9]*[,][1-9][0-9]*[,][1-9][0-9]*$";
            String parameetrid = "";
            while (!parameetrid.matches(pattern)) {
                System.out.print("Sisesta M (ridade arv), N (veergude arv), X (aarete arv): ");
                parameetrid = scanner.nextLine();
            }
            parameters = splitInputToInt(parameetrid);

            height = parameters[0];
            width = parameters[1];
            treasures = parameters[2];
            createMap(height, width, treasures);
            forLoop();
        }
    }
    public static boolean forLoop () {
        /*
        Terve mäng peale alguse on siin!
         */
        int totalGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int[] answerIntList;
            System.out.println("");
            if (totalGuesses == 0) {
                System.out.print("Edukat kaevamist!\n");
            }

            String asciiMapp = getAsciiMatrix(MAP);
            if (totalGuesses == 0) {
                System.out.println(asciiMapp);
            }
            System.out.println("kaevamisi: " + totalGuesses + ", aardeid jäänud: " + treasures);
            do {
                String patternQues = "^[0-9][0-9]*[,][0-9][0-9]*$";
                String answerString = "";

                while (!answerString.matches(patternQues)) {
                    System.out.print("Mida kaevame (rida, veerg): ");
                    answerString = scanner.nextLine();
                }
                totalGuesses++;

                answerIntList = splitInputToInt(answerString);
            } while (answerIntList[0] >= height | answerIntList[1] >= width);

            int answerInt = makeMove(answerIntList[0], answerIntList[1]);
            if (answerInt == 1) {
                System.out.print("\n");
                treasures--;
                setCell(answerIntList[0], answerIntList[1], CELL_FOUND);
                asciiMapp = getAsciiMatrix(MAP);
                if (treasures > 0) {
                    System.out.println(asciiMapp);
                    System.out.println("AARE!");
                    System.out.println("");
                }
            } else if (answerInt == 0) {

                setCell(answerIntList[0], answerIntList[1], CELL_OPENED);
                System.out.println("");
                asciiMapp = getAsciiMatrix(MAP);
                System.out.println(asciiMapp);
            } else if (answerInt == 3) {

                System.out.println("");
                System.out.println("See koht on juba valitud!");
                asciiMapp = getAsciiMatrix(MAP);
                System.out.println(asciiMapp);

            }
            if (treasures == 0) {
                asciiMapp = getAsciiMatrix(MAP);
                System.out.println(asciiMapp);
                System.out.println("kaevamisi: " + totalGuesses + ", aardeid jäänud: " + treasures);
                System.out.println("");
                System.out.println("Mäng läbi! Kokku tehti " + totalGuesses + " kaevamist.");

                System.out.print("Kas soovite edasi mängida(jah/ei): ");
                String continueS = scanner.nextLine();

                if (continueS.equals("ei")) {
                    System.exit(0);
                } else
                return true;
            }
        }
    }

    public static int[] splitInputToInt(String input) {
        String[] splitParts = input.replaceAll(" ", "").split(",");
        int[] Parameters = new int[splitParts.length];

        for (int i = 0; i < splitParts.length; i++) {
            try {
                Parameters[i] = Integer.parseInt(splitParts[i]);
            } catch (NumberFormatException e) {
                Parameters[i] = -1;
            }
        }
        return Parameters;
    }


    public static int makeMove(int row, int col) {
            if (MAP == null){
                return CELL_ERROR;
            }
            if (MAP[row][col] == 1) {
                return CELL_TREASURE;
            } else if (MAP[row][col] == 0) {
                return CELL_EMPTY;
            } else if (MAP[row][col] == 3) {
                return CELL_OPENED;
            } else if (MAP[row][col] == 2) {
                return CELL_OPENED;
            }

        return CELL_ERROR;
    }


    public static boolean createMap(int height, int width, int treasures) {
        // initialize map (for example 2D-array)
        //   - set all cells empty (is this needed?)
        // do some random for every treasure and add them to map:
        if (height * width >= treasures && treasures > 0){
            int[][] Map = new int[height][width];
            Random rand = new Random();
            MAP = Map;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    setCell(i, j, CELL_EMPTY);
                }
            }
            for (int r = 0; r < treasures; ) {


                int n = rand.nextInt(height);
                int m = rand.nextInt(width);
                if (MAP[n][m] != CELL_TREASURE) {
                    setCell(n, m, CELL_TREASURE);
                    r++;
                }
            }
            MAP = Map;
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean setCell(int row, int col, int cellContents) {
            if (MAP == null){
                return false;
            }
            if (cellContents == CELL_EMPTY) {
                MAP[row][col] = CELL_EMPTY;
                return true;
            } else if (cellContents == CELL_TREASURE) {
                MAP[row][col] = CELL_TREASURE;
                return true;
            } else if (cellContents == CELL_FOUND) {
                MAP[row][col] = CELL_FOUND;
                return true;
            } else if (cellContents == CELL_OPENED) {
                MAP[row][col] = CELL_OPENED;
                return true;
            }
        return false;
    }

    public static String getAsciiMatrix(int[][] Map) {
        String asciiMap = "";
        for (int row = 0; row<Map.length;row++){
            for (int column = 0; column<Map[row].length; column++){
                asciiMap = asciiMap + Map[row][column];
            }
            if (row != Map.length-1){
                asciiMap = asciiMap + "\n";
            }
        }

        asciiMap = asciiMap.replace("1",".");
        asciiMap = asciiMap.replace("0",".");
        asciiMap = asciiMap.replace("2","+");
        asciiMap = asciiMap.replace("3"," ");

        return asciiMap;

    }
}