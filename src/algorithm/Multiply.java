package algorithm;

import java.math.BigInteger;

public class Multiply {
    /**
     * 1부터 N까지의 곱
     * BigInteger를 사용하기 위함
     * @param N
     */
    public void multiplyBigNumber(int N){
        BigInteger bigInteger = new BigInteger("1");
        for(int i =1; i <= N; i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println("1부터 "+N+"까지의 곱 : " + bigInteger);
    }

    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        multiply.multiplyBigNumber(100);
    }
}
