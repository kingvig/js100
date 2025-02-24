import java.util.ArrayList;

public class DuplicateEncoder {

    public static void main(String[] args){
    //System.out.println(encode("   ()(   "));
    System.out.println(encode("Prespecialized"));
    }

    static String encode(String word){
        //ord = word.toLowerCase();
                //String str = "Hello";
                StringBuilder sb = new StringBuilder();
                for (char c : word.toLowerCase().toCharArray()) {
                    int count = 0;
                    for (char d : word.toLowerCase().toCharArray()) {
                        if (c == d) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        sb.append(")");
                    } else {
                        sb.append("(");
                    }
                }
        return sb.toString();
    }
}

//)()()])()(()()(
//(()((])()(()()(
