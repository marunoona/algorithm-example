package sorting;

public class BubbleSort {
    private void sort_1(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            //System.out.println("\n버블 정렬 " + (data.length - i) + "단계");

            for (int j = data.length-1; j > i; j--) {
                if (data[j-1] > data[j]) {
//                    Util.swap(data, j-1, j);
                    int tmp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp;
                }
                //Util.printArr(data);
            }
        }
    }

    private void sort_2(int[] data){
        for (int i = data.length - 1; i > 0; i--) {
            //System.out.println("\n버블 정렬 " + (data.length - i) + "단계");

            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    //Util.swap(data, j, j + 1);
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
                //Util.printArr(data);
            }
        }
    }

    private void sort_3(int[] data){
        int k = 0;
        int n = data.length;
        while (k < n - 1) {
            int last = n -1;
            for(int j = n-1; j > k; j--){
                if(data[j-1] > data[j]){
                    int tmp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tmp;
                    last = j;
                }
            }
            k = last;
        }

    }

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] data = {66, 10, 45, 3, 1};
        //버블 정렬
        bubbleSort.sort_1(data);
        //정렬된 데이터 출력
        System.out.println("--------------------\n버블 정렬 최종 결과:");
        Util.printArr(data);

        int[] data2 = {78, 14, 9, 25, 8};
        //버블 정렬
        bubbleSort.sort_2(data2);
        //정렬된 데이터 출력
        System.out.println("--------------------\n버블 정렬 최종 결과:");
        Util.printArr(data2);

        int[] data3 = {3, 39, 21, 18, 2};
        //버블 정렬
        long start3 = System.nanoTime();
        bubbleSort.sort_3(data3);
        long end3 = System.nanoTime();
        System.out.println("수행시간: " + (end3 - start3) + " ns");

        //정렬된 데이터 출력
        System.out.println("--------------------\n버블 정렬 최종 결과:");
        Util.printArr(data3);
    }
}

