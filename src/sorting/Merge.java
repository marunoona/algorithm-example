package sorting;

public class Merge {
    private void mergeSort(int[] data, int p, int q) {
        int mid;
        if (p < q) {
            mid = (p + q) / 2;
            mergeSort(data, p, mid);
            mergeSort(data, mid + 1, q);
            merge(data, p, mid, q);
        }
    }

    private void merge(int[] data, int p, int mid, int q) {
        int i, j, k;
        i = p;
        j = mid + 1;
        k = p;
        int size = data.length;
        int[] tmp = new int[size];
        while (i <= mid && j <= q) {
            if (data[i] <= data[j])
                tmp[k++] = data[i++];
            else
                tmp[k++] = data[j++];
        }
        //아래 두개의 while문은 결과적으로 한개만 실행됨
        //1. 앞쪽에 데이터가 남아있을 떼
        while (i <= mid) {
            tmp[k++] = data[i++];
        }
        //2. 뒤쪽에 데이터가 남아있을 때
        while (j <= q) {
            tmp[k++] = data[j++];
        }
        if (k - p >= 0) System.arraycopy(tmp, p, data, p, k - p);
    }

    public static void main(String[] args) {
        int[] data = {6, 3, 3, 7, 1, 21, 3, 7, 2, 25};
        Merge merge = new Merge();
        merge.mergeSort(data, 0, data.length - 1);
        for (Integer n : data) {
            System.out.print(n + " ");
        }
    }
}
