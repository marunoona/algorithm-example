package sorting;

public class Insertion {

    private void sort(int[] data) {
        int length = data.length;
        int temp, j;
        for (int i = 1; i < length; i++) {
            temp = data[i];
            for (j = i - 1; j >= 0 && temp < data[j]; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();

        int[] data = {66, 10, 35, 3, 6, 1, 12};

        insertion.sort(data);

        for (Integer n : data) {
            System.out.print(n + " ");
        }
    }
}
