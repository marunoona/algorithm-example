package algorithm;

public class ConvertNumber {
    private String convert(int num, int n) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rest = num % n;
            //sb.append(rest >= 10 ? String.valueOf((char) ('A' + (rest - 10))) : rest);
            // 10부터 A~Z로 표현
            if(rest >= 10)
                //나머지가 보다 크면 10부터 A이므로 나머지 값에서 10을 빼고
                // 아스키코드 값  'A'를 더해줌으로써 A~Z까지 알파벳으로 저장
                sb.append((char)('A'+(rest-10)));
            else
                sb.append(rest);
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
