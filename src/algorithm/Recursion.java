package algorithm;

/**
 * 재귀함수를 이용하여 다양한 함수 만들기
 */
public class Recursion {
    private static int[] table = new int[32];

    /**
     * 정수 n까지의 합
     *
     * @param n
     * @return
     */
    private int sumNumber(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumNumber(n - 1);
    }

    /**
     * 정수 n!
     *
     * @param n
     * @return
     */
    private int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    /**
     * 제곱근 구하기
     *
     * @param x
     * @param n
     * @return
     */
    private double power(double x, int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    /**
     * 피보나치 수열
     *
     * @param n
     * @return
     */
    private int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 메모이제이션을 이용한 피보나치수열
     *
     * @param n
     * @return
     */
    private int memoFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (table[n] > 0) {
            return table[n];
        }
        table[n] = memoFibonacci(n - 1) + memoFibonacci(n - 2);
        return table[n];
    }

    /**
     * 최대공약수
     *
     * @param m
     * @param n
     * @return
     */
    private int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }

    /**
     * 최대공야수
     *
     * @param m
     * @param n
     * @return
     */
    private int gcd2(int m, int n) {
        if (n == 0)
            return m;
        else
            return gcd2(n, m % n);
    }

    /**
     * 정수 n의 2진수 값
     *
     * @param n
     */
    private void printBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    /**
     * 문자열 거꾸로 출력하기
     *
     * @param str
     */
    private void printCharReverse(String str) {
        if (str.length() == 0) {
            return;
        } else {
            printCharReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    /**
     * 문자열 길이 구하기
     *
     * @param string
     * @return
     */
    private int getStringLength(String string) {
        if (string.equals(""))
            return 0;
        else
            return 1 + getStringLength(string.substring(1));
    }

    public static void main(String[] args) {
        int n = 4;
        Recursion recursion = new Recursion();
        System.out.println("#1. " + n + "까지의 합 :" + recursion.sumNumber(n));
        System.out.println("#2. " + n + "! = " + recursion.factorial(n));
        System.out.println("#3. " + n + "^3 = " + recursion.power(4, 3));
        System.out.println("#4. fibonacci(4) = " + recursion.fibonacci(4));
        System.out.println("#5. memoFibonacci(4) = " + recursion.memoFibonacci(4));
        System.out.println("#6. " + "9와 3의 최대공약수 : " + recursion.gcd(9, 3));
        System.out.println("#7. " + "7과 14의 최대공약수 : " + recursion.gcd2(7, 14));
        System.out.print("#8. 35의 2진수 : ");
        recursion.printBinary(35);
        System.out.println();
        String string = "Happy birthday to you";
        recursion.printCharReverse(string);
        System.out.println();
        System.out.println("문자열 길이 :" + recursion.getStringLength(string));
    }
}
