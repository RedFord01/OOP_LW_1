public class ArraySeparation {
    public static void main(String[] args) {
        int[] array = new int []{1,1,1,2,1};
        System.out.println(areEqual(array));
    }
    private static boolean areEqual (int[] arr) {
        for(int i = 1; i < arr.length; i++) {
// from start to i in the first part and from i to the end in the second part
            if(getSum(0,i,arr) == getSum(i, arr.length, arr)) {
                return true;
            }
        }
        return false;
    }
    private static int getSum (int start, int end, int[] arr) {
        int sum = 0;
        for(int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
