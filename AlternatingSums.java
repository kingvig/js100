import java.util.Arrays;

public class AlternatingSums {

    public static void main(String[] args){

        int[] a = {2, 4, 7};
        System.out.println(Arrays.toString(alternatingSums(a)));

        a = new int[] {2, 4, 7, 6};
        System.out.println(Arrays.toString(alternatingSums(a)));

        a = new int[] {2, 4, 7, 6, 6};
        System.out.println(Arrays.toString(alternatingSums(a)));

        a = new int[] {2, 4, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        System.out.println(Arrays.toString(alternatingSums(a)));

        a = new int[] {2, 4, 7, 6, 6, 8};
        System.out.println(Arrays.toString(alternatingSums(a)));

    }

    public static int[] alternatingSums(int[] arr){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i< arr.length;i++){
            if(i %2 == 0){
                sum1+=arr[i];
            }else {
                sum2+=arr[i];
            }
        }
        return new int[]{sum1, sum2};
    }
}
