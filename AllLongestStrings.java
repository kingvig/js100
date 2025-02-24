import java.util.ArrayList;
import java.util.Arrays;

public class AllLongestStrings {

    public static void  main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("aba", "aa", "ad", "vcd", "aba","adbjds"));

        System.out.println(allLongestStrings(list));
    }
    public  static  ArrayList<String> allLongestStrings(ArrayList<String> arr){

        int maxLength = 0;
        ArrayList<String> result = new ArrayList<>();

        for(String str : arr){
            if(str.length()>maxLength){
                maxLength = str.length();
            }
        }
        for(String str : arr){
            if(str.length()==maxLength){
                result.add(str);
            }
        }

        return result;
    }
}
