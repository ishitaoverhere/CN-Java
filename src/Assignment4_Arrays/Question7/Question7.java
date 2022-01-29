package Assignment4_Arrays.Question7;

public class Question7 {
    public static void main(String[] args) {
        int[] arr1 = {3, 10, 1, 0, 9};
        int[] arr2 = {32, 5, 10, 6, 9, 1};
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    System.out.print(k + " ");
                    break;
                }
            }
        }
    }
}
