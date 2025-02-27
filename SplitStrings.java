import java.util.ArrayList;
import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        int[] a = {2, 4, 7};
        System.out.println(Arrays.toString((splitStrings("kings"))));
        System.out.println(Arrays.toString((splitStrings(""))));
    }

    public static String[] splitStrings(String s) {
        if(s.isEmpty()){
            return new String[0];
        }
        int length = (int) Math.ceil((double) s.length() / 2);
        String[] result = new String[length];
        for (int i = 0; i < s.length(); i += 2) {
            result[i/2] = s.substring(i, Math.min(i + 2, s.length()));
        }
        if(result[length-1].length()<2){
            result[length-1] =result[length-1]+"_";
        }
return result;
    }
}
