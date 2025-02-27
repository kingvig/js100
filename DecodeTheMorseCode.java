import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DecodeTheMorseCode {

    public static void main(String[] args){
        //System.out.println(encode("   ()(   "));
        //System.out.println(decodeTheMorseCode("king vigny arthur"));
        System.out.println(decodeTheMorseCode(".... . -.--   .--- ..- -.. ."));
//        System.out.println(decodeTheMorseCode(-3));
    }
    private static final Map<String, String> MORSE_CODE = new HashMap<>();
    static {
        // Letters
        MORSE_CODE.put(".-", "A");
        MORSE_CODE.put("-...", "B");
        MORSE_CODE.put("-.-.", "C");
        MORSE_CODE.put("-..", "D");
        MORSE_CODE.put(".", "E");
        MORSE_CODE.put("..-.", "F");
        MORSE_CODE.put("--.", "G");
        MORSE_CODE.put("....", "H");
        MORSE_CODE.put("..", "I");
        MORSE_CODE.put(".---", "J");
        MORSE_CODE.put("-.-", "K");
        MORSE_CODE.put(".-..", "L");
        MORSE_CODE.put("--", "M");
        MORSE_CODE.put("-.", "N");
        MORSE_CODE.put("---", "O");
        MORSE_CODE.put(".--.", "P");
        MORSE_CODE.put("--.-", "Q");
        MORSE_CODE.put(".-.", "R");
        MORSE_CODE.put("...", "S");
        MORSE_CODE.put("-", "T");
        MORSE_CODE.put("..-", "U");
        MORSE_CODE.put("...-", "V");
        MORSE_CODE.put(".--", "W");
        MORSE_CODE.put("-..-", "X");
        MORSE_CODE.put("-.--", "Y");
        MORSE_CODE.put("--..", "Z");
        // Digits
        MORSE_CODE.put(".----", "1");
        MORSE_CODE.put("..---", "2");
        MORSE_CODE.put("...--", "3");
        MORSE_CODE.put("....-", "4");
        MORSE_CODE.put(".....", "5");
        MORSE_CODE.put("-....", "6");
        MORSE_CODE.put("--...", "7");
        MORSE_CODE.put("---..", "8");
        MORSE_CODE.put("----.", "9");
        MORSE_CODE.put("-----", "0");
        // Special characters (e.g., SOS)
        MORSE_CODE.put("...---...", "SOS");
    }

    public static String decodeTheMorseCode(String str){
        str = str.trim();
        String [] parts = str.split("   ",-1);
        StringBuilder decodedMessage = new StringBuilder();

        for (String word : parts) {
            // Split into Morse code characters (using single space as delimiter)
            String[] letters = word.split(" ");

            // Decode each Morse code character
            for (String s : letters) {
                decodedMessage.append(MORSE_CODE.get(s));
            }

            // Add a space between words
            decodedMessage.append(" ");
        }
        return  decodedMessage.toString();
    }
}
