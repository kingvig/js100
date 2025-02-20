import java.util.ArrayList;
import java.util.Arrays;

public class AddBorder {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("abc");
        a.add("ded");
        System.out.println(addBorder(a));
    }
    public static ArrayList<String> addBorder(ArrayList<String> arr) {
        int length = arr.get(0).length();
        int height = arr.size();
        for (int i = 0; i < height; i++) {
            String str = arr.get(i);
            str = "*" + str + "*";
            arr.set(i, str);
        }
        String asterisks = "*".repeat(length+2);
        arr.addFirst(asterisks);
        arr.add(asterisks);
        return arr;
    }
}
