package sorting;

public class Bubble {
    private void sort(int[] data) {
        int temp;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        int[] data = {66, 10, 45, 3, 1};

        bubble.sort(data);

        for (Integer n : data) {
            System.out.print(n + " ");
        }
    }
}

