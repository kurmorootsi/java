/**
 * Created by Kurmo on 1.05.2016.
 */
public class EX16 {
    /**
     * Number which divides given number by 10.
     */
    private static final int DIVIDENUMBER = 10;
    /**
     * Number which the program should match with.
     */
    private static final int NUMBERNINE = 9;
    /**
     * Number which the program should match with.
     */
    private static final int NUMBEREIGHT = 8;
    /**
     * Method for counting 8's and 9's.
     * @param n number generated from the main method
     * @return Number of 8's and 9's in the n
     */
    public static int count98(int n) {
        n = Math.abs(n);
        int anwser = 0;
        int lastNumber = n % DIVIDENUMBER;
        int nextNumber = n / DIVIDENUMBER;
        if (lastNumber == NUMBEREIGHT || lastNumber == NUMBERNINE) {
            anwser += 1;
        }
        if (nextNumber > 1) {
            return anwser + count98(nextNumber);
        } else return anwser;
    }

    /**
     * Method for counting 8's and 9's.
     * @param n number generated from the main method
     * @return Number of 8's and 9's in the n
     */

    public static int count98Harder(int n) {
        n = Math.abs(n);
        int answer = 0;
        int nextNumber = n / DIVIDENUMBER;
        int lastNumber = nextNumber % 100;
        int firstNumber = lastNumber % 10;
        int secondNumber = lastNumber / 10;
        int sum = firstNumber + secondNumber;
        if (sum == 8 || sum == 9) {
            answer += 1;
        }
        if ()
        return answer;
    }
    /**
     * Main method.
     * @param args No idea
     */
    public static void main(String[] args) {
        System.out.println(count98Harder(989898));
    }
}
