package sorting;

public class QuickSort {
    /**
     * @param data  정렬할 데이터 배열
     * @param begin 배열의 시작 인덱스
     * @param end   배열의 끝 인덱스
     */
    private void quickSort(int[] data, int begin, int end) {
        int pivot;
        if (begin < end) {
            pivot = partition(data, begin, end);  //분할
            quickSort(data, begin, pivot - 1);  //pivot을 기준으로 왼쪽 부분배열 정렬
            quickSort(data, pivot + 1, end);  //pivot을 기준으로 오른쪽 부분배열 정렬
        }
    }

    /**
     *
     * @param data
     * @param begin 시작 인덱스 : pivot보다 크거나 같은 값을 찾음
     * @param end   마지막 인덱스 : pivot보다 작은 값을 찾음
     * @return
     */
    private int partition(int[] data, int begin, int end) {
        int left = begin;
        int right = end;
        int pivot = (left + right) / 2; //기준값 인덱스
        int i = 0;
        System.out.println("퀵 정렬 " + ++i + "단계: pivot: " + data[pivot]);

        //정렬시작
        while (left < right) {
            //left를 움직이는 부분
            while ((data[left] < data[pivot]) && (left < right))
                left++;
            //right를 움직이는 부분
            while ((data[right] >= data[pivot]) && (left < right))
                right--;
            if (left < right)
                Util.swap(data, left, right);
        }
        Util.swap(data, pivot, right);
        Util.printArr(data);
        return left;
    }

    public static void main(String[] args) {
        int[] data = {69, 10, 30, 2, 16, 8, 31, 22};
        QuickSort quickSort = new QuickSort();
        System.out.println("정렬 전 데이터 : ");
        Util.printArr(data);
        //정렬
        quickSort.quickSort(data, 0, data.length - 1);
        //정렬된 결과 출력
        System.out.println("--------------------\n퀵 정렬 최종 결과:");
        Util.printArr(data);
    }
}
