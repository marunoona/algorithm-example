package algorithm;

public class Permutation {

    public void doPerm(int[] arr, int depth, int n, int k){
        if(depth == k){ //한번 depth가 k로 도달하면 사이클이 돌았기에 출력함
            print(arr,k);
            return;
        }
        for(int i = depth; i < n; i++){
            swap(arr, i, depth);
            doPerm(arr, depth+1, n, k);
            swap(arr, i, depth);
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void print(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            if (i == k - 1)
                System.out.println(arr[i]);
            else System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        int[] arr = {1,2,3,4};
        permutation.doPerm(arr,0,4,4);
    }
}
