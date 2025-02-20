import java.util.ArrayList;

public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addTwoDigits(329));
    }
    public static int addTwoDigits(int number){
        String strs = Integer.toString(number);
        int sum = 0;
         for(int i = 0; i<strs.length(); i++){
             sum = sum + Integer.parseInt(String.valueOf(strs.charAt(i)));

         }
        return sum;
    }
}
