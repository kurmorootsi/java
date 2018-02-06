import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kurmo on 21.03.2016.
 */
public class E16 {
    public static void main(String[] args){
        Random rnd = new Random(12);
        int[] board = new int [4];
        int[] numbers = rnd.ints(20, 1, 7).toArray();
        int score = play(0, board, numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(score);
    }
    public static int getScore(int[] board) {
        int score = 0;
        score += Math.abs(board[0] - board[3]);
        score += Math.abs(board[1] - board[2]);
        return score;
    }
    /*
    4 3 | 3 4 => 0
    5 1 | 5 7 => 5 + 2 = 6

     */
    public static int bestScore = 1000;
    public static int play(int count, int[] board, int[] possibleMoves) {
        if (count == 4) {
            int score = getScore(board);
            return score;
        }

        //kui 2 käiku juba vaadatud ss stop
        //for võta kõik võimalikud käigud
        // tee see käik "lauale"
            // play(praeguse ajutise seisu kohta)
        for (int i = 0; i < possibleMoves.length; i++){
            int nr = possibleMoves[i];
            if (nr == -1) continue;
            board[count] = nr;
            possibleMoves[i] = -1;
            int score = play(count + 1, board, possibleMoves);
            if (score < bestScore) {
                bestScore = score;
                System.out.println(score + Arrays.toString(board));

            }
            possibleMoves[i] = nr;
            board[count] = 0;
        }
        // hinda seisu
        // võta kõik tagasi
        return bestScore;
    }
}
