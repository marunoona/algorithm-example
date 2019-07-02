package algorithm;

public class ConvertNumber {
    private String convert(int num, int n) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rest = num % n;
            sb.append(rest >= 10 ? String.valueOf((char) ('A' + (rest - 10))) : rest);
            num /= n;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ConvertNumber convertNumber = new ConvertNumber();
        int num = 233;
        for (int i = 2; i <= 16; i++) {
            String result = convertNumber.convert(num, i);
            System.out.println(num+"의 "+i+"진법: "+result);
        }
    }
}
