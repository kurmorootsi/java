import java.util.HashMap;


public class EX03 {

    public static String encrypt(String plainText, int rotation) {
        if (plainText == null){
            return null;
        }
        if (plainText.length() < 1){
            return "";
        }
        String s = "";
        String Minitext = minimizeText(plainText);
        int len = Minitext.length();
        if (rotation == 0){
            return Minitext;
        }
        for (int x = 0; x < len; x++) {
            char c = (char)(Minitext.charAt(x) + rotation);
            if (Character.isLetter(c)) {
                if (c > 'z'){
                    s += (char)(Minitext.charAt(x) - (26 - rotation));
                }
                else {
                    s += (char)(Minitext.charAt(x) + rotation);}
            }
            else {
                if (c > 'z'){
                    s += (char)(Minitext.charAt(x) - (26 - rotation));
                }
                else
                s += (char)(Minitext.charAt(x));
            }

        }

        return s.toLowerCase();
    }

    public static String decrypt(String cryptoText, int rotation) {
        if (cryptoText == null){
            return null;
        }
        if (cryptoText.length() < 1){
            return "";
        }
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

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghijklmnopqrstuvwxyz", 1));
        System.out.println(decrypt("zpv upp csvuvt?", 1));
    }
}