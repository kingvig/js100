public class IsSquareNumber {

    public static void main(String[] args){
        System.out.println(isSquareNumber(26));
    }
    public static boolean isSquareNumber(int num){
        if(num<0){
            return false;
        }
        return Math.sqrt(num) instanceof int;
    }
}
