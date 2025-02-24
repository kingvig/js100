public class ComplementaryDNA {

    public static void main(String[] args){
        //System.out.println(encode("   ()(   "));
        System.out.println(complementaryDNA("ATTGC"));
        System.out.println(complementaryDNA("GTAT"));
    }

    static String complementaryDNA(String word){
        //ord = word.toLowerCase();
        //String str = "Hello";
        StringBuilder sb = new StringBuilder();


        for (char c : word.toLowerCase().toCharArray()) {
            if (c=='c') {
                sb.append("g");
            } else if (c=='a') {
                sb.append("t");
            }
            else if (c=='t') {
                sb.append("a");
            }
            else if (c=='g') {
                sb.append("c");
            }
        }
        return sb.toString();
    }
}
