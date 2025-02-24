import java.util.function.IntBinaryOperator;

public class BitCounting {


    public static void main(String[] args){
        //System.out.println(encode("   ()(   "));
        System.out.println(bitCounting(35));
        System.out.println(bitCounting(1234));
        System.out.println(bitCounting(-3));
    }

    static int bitCounting(int num){
        int result=0;

        if(num<0){
            return 0;
        }

        return  Integer.bitCount(num);
    }
}
