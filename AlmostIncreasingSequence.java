import java.util.ArrayList;
import java.util.Arrays;

public class AlmostIncreasingSequence {

    public static void  main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(AlmostIncreasingSequence(list));
    }

    public static boolean AlmostIncreasingSequence( ArrayList<Integer> arr){


        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            arr.remove(i);
            if (isSorted(arr)) {
                //System.out.println("True");
                return true;
            } else {
                arr.add(i, temp);
            }
        }
        return false;
    }
    public static boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
