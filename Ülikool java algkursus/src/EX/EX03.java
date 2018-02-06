package EX;

import java.util.HashMap;

/**
 * Created by Kurmo on 16/2/16.
 */
public class EX03 {

    /**
     * Given text and a rotation, encrypts text.
     * @param plainText plain text, readable by humanoids
     *                  with relative ease.
     * @param rotation
     * @return encrypted text
     */
    public static String encrypt(String plainText, int rotation) {
        String s = "";
        String Minitext = minimizeText(plainText);
        int len = Minitext.length();
        for (int x = 0; x < len; x++) {
            char c = (char)(Minitext.charAt(x) + rotation);
            if (Character.isLetter(c)) {
                if (c > 'z')
                    s += (char)(Minitext.charAt(x) - (26-rotation));
                else
                    s += (char)(Minitext.charAt(x) + rotation);
            }
            else {
                s += (char)(Minitext.charAt(x));
            }

        }

        return s.toLowerCase();
    }

    /**
     * Finds the most frequently occurring letter in text.
     * @param text- either plain or encrypted text.
     * @return the most frequently occurring letter in text.
     */
    public static String findMostFrequentlyOccurringLetter(String text) {
        int SentenceLen = text.length();
        int LastLetter = 0;
        String FirstLetter = "";
        String letter = "";
        for (int x = 0; text.length() > x; x++) {
            FirstLetter = String.valueOf(text.charAt(x));
            String a = text.replace(FirstLetter, "");
            int len = a.length();
            int LetterNum = SentenceLen - len;
            if (LetterNum > LastLetter){
                LastLetter = LetterNum;
                letter = FirstLetter;

            }
        }
        return letter;
    }

    /**
     * Removes the most prevalent letter from text.
     * @param text either plain or encrypted text.
     * @return text in which the most prevalent letter has been removed.
     */
    public static String minimizeText(String text) {
        String MiniText = "";
        String MostFreq = findMostFrequentlyOccurringLetter(text);
        int len = text.length();
        for (int x = 0; x < len; x++) {
            char c = (text.charAt(x));
            String m = Character.toString(c);
            if (m.equals(MostFreq)) {
            }
            else {
                MiniText += (char)(text.charAt(x));
            }
        }
        return MiniText.toLowerCase();
    }

    /**
     * Given the initial rotation and the encrypted text, this method
     * decrypts said text.
     * @param cryptoText Encrypted text.
     * @param rotation How many letters to the right the alphabet was
     *                 shifted in order to encrypt text.
     * @return Decrypted text.
     */
    public static String decrypt(String cryptoText, int rotation) {
        String s = "";
        int len = cryptoText.length();
        for (int x = 0; x < len; x++) {
            char c = (char)(cryptoText.charAt(x));
            if (Character.isLetter(c)) {
                if (c > 'z')
                    s += (char)(cryptoText.charAt(x) + (26-rotation));
                else
                    s += (char)(cryptoText.charAt(x) - rotation);
            }
            else {
                s += (char)(cryptoText.charAt(x));
            }

        }

        return s.toLowerCase();
    }

    /**
     * The main method, which is the entry point of the program.
     * @param args Arguments from the command line
     */
    public static void main(String[] args) {
        System.out.println(encrypt("you too Brutus?", 1)); // => zv u csvuvt?
        // (both u and o appear 3 times, o comes earlier in alphabet)
        System.out.println(decrypt("zpv upp csvuvt?", 1)); // => you too brutus?
        System.out.println(findMostFrequentlyOccurringLetter("you too Brutus?")); // => o
        System.out.println(minimizeText("you too Brutus?")); // yu t brutus?
    }
}