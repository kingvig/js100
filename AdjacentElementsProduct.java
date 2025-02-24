public class AdjacentElementsProduct {

    public static void  main(String[] args){
        System.out.println(AdjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3,30}));
    }
    public  static  int AdjacentElementsProduct(int [] arr){

        int product = 0;

        for(int i= 0; i < arr.length-1;i++){
            if (arr[i] * arr[i+1] > product){
                product = arr[i] * arr[i+1];
            }
        }
        return product;
    }
}
