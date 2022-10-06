public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{12,15,16,17,18};
        System.out.println(isSorted(array)); //result output
    }
    private static boolean isSorted(int[] arr) {
        if (arr.length >= 2) { //if number of elements in array is more or equal to 2
            boolean flag = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] >= arr[i]) { //if next element is bigger or equal to previous
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        return false; //if the main condition isn`t met
    }
}