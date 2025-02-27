import java.util.Arrays;
import java.util.stream.IntStream;

public class OddOrEven {

    public static void main(String[] args){
        int[] a = {2, 4, 7};
        System.out.println((oddOrEven(a)));

        a = new int[] {2, 4, 7, 6};
        System.out.println((oddOrEven(a)));

        a = new int[] {2, 4, 7, 6, 6};
        System.out.println((oddOrEven(a)));

        a = new int[] {2, 4, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        System.out.println((oddOrEven(a)));

        a = new int[] {2, 4, 7, 6, 6, 8};
        System.out.println((oddOrEven(a)));
        a = new int[] {0};
        System.out.println((oddOrEven(a)));
    }

    static String  oddOrEven(int [] arr){

        return (Arrays.stream(arr).sum()) %2 == 0? "even" : "odd";
    }
}
