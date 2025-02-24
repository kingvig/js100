public class AlphabetSubSequence {

    public static void main(String[] args){

        System.out.println(alphabetSubSequence("vigny"));
        System.out.println(alphabetSubSequence("ace"));
        System.out.println(alphabetSubSequence("bxz"));
        System.out.println(alphabetSubSequence("effg"));
    }
    public static boolean alphabetSubSequence(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] characters = s.toCharArray();
        int[] carValues = new int[characters.length];
        for(int i=0;i<characters.length; i++){
            carValues[i]= (int )characters[i];
        }
        return isSortedWithoutDoubles(carValues);

        //return false;
    }

    public static boolean isSortedWithoutDoubles(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i+ 1]) {
                return false;
            }
        }
        return true;
    }
}
