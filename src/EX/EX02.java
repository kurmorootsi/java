/**
 * Created by Kurmo Andres Rootsi on 08/2/16.
 */
package EX;
public class EX02 {

    public static final int WORM_FEEDING_DAY = 3;

    public static final int BATHING_DAY = 5;

    public static final int NUMBER_OF_DAYS = 30;

    public static void main(String[] args) {
        // call and print getInstructionForCurrentDay inside a loop here

        for (int day = 1; day <= NUMBER_OF_DAYS; day++) {
            System.out.println(getInstructionForCurrentDay(day));

        }
    }

    /**
     * Return instruction for given day.
     * @param currentDay number of day to print instructions for.
     */
    public static String getInstructionForCurrentDay(int day) {
        if (day <= 0) {
            String answer = "Cant fly back in time!";
            return answer;
        } else if (day % BATHING_DAY == 0 && day % WORM_FEEDING_DAY == 0) {
            String answer = "Day " + day + ": glide in wind";
            return answer;
        } else if (day % BATHING_DAY == 0) {
            String answer = "Day " + day + ": bathe in sand";
            return answer;
        } else if (day % WORM_FEEDING_DAY == 0) {
            String answer = "Day " + day + ": feed worms";
            return answer;
        } else {
            String answer = "Day " + day + ": give fruit and water";
            return answer;
        }
    }
}