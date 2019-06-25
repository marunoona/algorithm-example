package sorting;

public class Util {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArr(int[] arr){
        for (Integer n : arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
