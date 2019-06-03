package sorting;

public class Selection {
    private void sort(int[] data) {
        int size = data.length;
        int min;
        int temp;

        //배열의 값 중 최소값을 찾아서 위치를 변경
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        int[] data = {66, 10, 1, 6, 13};

        //정렬
        selection.sort(data);

        //정렬된 배열 출력
        for (Integer n : data) {
            System.out.print(n+" ");
        }
    }
}
