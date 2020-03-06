import java.util.stream.IntStream;
/**
 * 创建源源不断的素数 - 有点像IntStream.of(2, 3, 5, 7, 11, 13, 17)，但无限。该流必须能够在几秒钟内产生一百万个素数。
 */
public class Primes {

    public static IntStream stream() {
        return IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(Primes::isPrime);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < (int) Math.sqrt(number) + 1; i++)
            if (number % i == 0) return false;
        return true;
    }
}
