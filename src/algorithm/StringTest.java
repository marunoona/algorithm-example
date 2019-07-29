package algorithm;

public class StringTest {
    /**
     * 가운데 글자 가져오기
     *
     * @param word
     * @return
     */
    private String getMiddleString(String word) {
        int n = word.length() / 2;
        if (word.length() % 2 == 0)
            word = word.substring(n - 1, n + 1);
        else
            word = word.substring(n, n + 1);

        return word;
    }

    private String reverseString01(String word) {
        StringBuffer reverse = new StringBuffer(word);
        return String.valueOf(reverse.reverse());
    }

    private String reverseString02(String word){
        StringBuilder reverseWord = new StringBuilder();
        for (int i = word.length()-1; i > -1; i--) {
            reverseWord.append(word.charAt(i));
        }
        return reverseWord.toString();
    }

    private String reverseString03(String word){
        StringBuilder reverseString = new StringBuilder();
        String[] str1 = word.split("");
        for (int i = str1.length-1; i > -1; i--) {
            reverseString.append(str1[i]);
        }
        return reverseString.toString();
    }

    public void printStar(int num){
        for(int j = 1 ; j<=num ; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.getMiddleString("birthday"));

        System.out.println(stringTest.reverseString01("Happy Birthday"));
        System.out.println(stringTest.reverseString02("Happy Birthday"));
        System.out.println(stringTest.reverseString03("Happy Birthday to you"));

        stringTest.printStar(10);
    }
}
