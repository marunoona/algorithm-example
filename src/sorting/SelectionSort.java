package sorting;

public class SelectionSort {
    private void sort(int[] data) {
        int size = data.length;
        int min;    //최저 값을 담을 요소

        //배열의 값 중 최소값을 찾아서 위치를 변경
        for (int i = 0; i < size - 1; i++) {
            min = i;    //첫번째 요소를 선택
            for (int j = i + 1; j < size; j++) {
                if (data[min] > data[j]) {  //첫번째 요소와 가장 적은 값을 찾는 비교 연산
                    min = j;
                }
            }
            Util.swap(data, min, i);
            System.out.println("선택 정렬 " + (i + 1) + " 단계: ");
            Util.printArr(data);
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] data = {69, 10, 30, 2, 16, 8};

        //정렬
        selectionSort.sort(data);

        //정렬된 배열 출력
        System.out.println("--------------------\n선택 정렬 최종 결과:");
        Util.printArr(data);
    }
}
