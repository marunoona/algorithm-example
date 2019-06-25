package sorting;

public class Insertion {

    private void sort(int[] data) {
        int length = data.length;
        int tmp, aux;
        for (int i = 1; i < length; i++) {
            tmp = data[i];
            aux = i -1;
            while ((aux >= 0) && (data[aux] > tmp)) {
               data[aux + 1] = data[aux];
               aux--;
            }
            data[aux + 1] = tmp;
        }

    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();

        int[] data = {66, 10, 35, 3, 6, 1, 12};

        //정렬
        insertion.sort(data);

        //정렬된 데이터 출력
        System.out.println("--------------------\n삽입 정렬 최종 결과:");
        Util.printArr(data);

    }
}
