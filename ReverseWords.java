import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args){
        //System.out.println(encode("   ()(   "));
        System.out.println(reverseWords("This is an example!"));
        System.out.println(reverseWords("double  spaces"));
    }

    static String reverseWords(String word){
        String [] words= word.split(" ",-1);
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        return  String.join(" ", words);
    }
}
