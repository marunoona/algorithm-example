package sorting;

public class BubbleSort {
    private void sort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            System.out.println("\n버블 정렬 " + (data.length - i) + "단계");

            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    Util.swap(data, j, j + 1);
                }
                Util.printArr(data);
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] data = {66, 10, 45, 3, 1};

        //버블 정렬
        bubbleSort.sort(data);
        //정렬된 데이터 출력
        System.out.println("--------------------\n버블 정렬 최종 결과:");
        Util.printArr(data);
    }
}

