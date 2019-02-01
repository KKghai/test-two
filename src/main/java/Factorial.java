import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {

    static BigInteger calculateFunction(int m, int r) {
        return calculateDiff(m, r).divide((calculateFactorial(r)));
    }

    static BigInteger calculateFactorial(int n) {
        if(n < 2) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(2, n).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }

    static BigInteger calculateDiff(int n, int k) {
        if(n < 2) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(n-k+1, n).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }
}
