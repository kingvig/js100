public class AbsoluteValuesSumMinimization {

    public static void main(String[] args) {
        int[] a = {2, 4, 7};
        System.out.println(calculateAbsoluteValuesSumMinimization(a));

        a = new int[] {2, 4, 7, 6};
        System.out.println(calculateAbsoluteValuesSumMinimization(a));

        a = new int[] {2, 4, 7, 6, 6};
        System.out.println(calculateAbsoluteValuesSumMinimization(a));

        a = new int[] {2, 4, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        System.out.println(calculateAbsoluteValuesSumMinimization(a));

        a = new int[] {2, 4, 7, 6, 6, 8};
        System.out.println(calculateAbsoluteValuesSumMinimization(a));

    }

    public static int calculateAbsoluteValuesSumMinimization(int[] arr){
        boolean isEven = arr.length % 2 ==0;
        return isEven? arr[arr.length/2 -1] : arr[(int) Math.floor(arr.length/2)];
    }

}