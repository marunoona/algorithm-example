package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RandomQuiz {
    private boolean printRandom() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomValue = (int) (Math.random() * 10) + 1;
            System.out.println(randomValue);
            list.add(randomValue);
        }

        boolean duplicate;
        duplicate = list.stream().distinct().count() != list.size();
        return duplicate;
    }

    public static void main(String[] args) {
        RandomQuiz randomQuiz = new RandomQuiz();
        System.out.println(randomQuiz.printRandom());
    }
}
