package sorting;

public class Merge {
    /**
     *
     * @param data 정렬해야 할 데이터 배열
     * @param p data 배열의 시작 인덱스
     * @param q data 배열의 마지막 인덱스
     */
    private void mergeSort(int[] data, int p, int q) {
        int mid;    //중간값 (나눠야하니까)
        if (p < q) {
            mid = (p + q) / 2;
            mergeSort(data, p, mid);        //시작부터 중간까지
            mergeSort(data, mid + 1, q);    //중간부터 끝까지
            merge(data, p, mid, q);         //합치기
        }
    }

    /**
     *
     * @param data
     * @param p
     * @param mid
     * @param q
     */
    private void merge(int[] data, int p, int mid, int q) {
        int i, j, k;
        i = p;
        j = mid + 1;
        k = p;  //추가 배열의 위치 인덱스
        int size = data.length;
        int[] tmp = new int[size];  //합병하기 위한 추가 배열
        while (i <= mid && j <= q) {    //분할된 집합 중 한쪽이 데이터가 없을때까지
            if (data[i] <= data[j])     //정렬된 집합의 값을 비교함
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
        int[] data = {69, 10, 30, 2, 16, 8, 31, 22};

        Merge merge = new Merge();
        //정렬
        merge.mergeSort(data, 0, data.length - 1);
        //정렬된 데이터 출력
        System.out.println("--------------------\n합병 정렬 최종 결과:");
        Util.printArr(data);
    }
}
