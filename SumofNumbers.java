import java.util.stream.IntStream;

public class SumofNumbers {

    public static void main(String[] args){
        //System.out.println(encode("   ()(   "));
        System.out.println(sumofNumbers(0,5));
        //System.out.println(sumofNumbers(1234,38));
        System.out.println(sumofNumbers(-1,2));
        System.out.println(sumofNumbers(2,2));
        System.out.println(sumofNumbers(-1,0));
    }

    static int sumofNumbers(int a,int b){
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }
}
