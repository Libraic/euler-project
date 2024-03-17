package problems;

import java.util.List;
import java.util.ArrayList;

public class Problem3 {

    private static final long NUMBER = 600_851_475_143L;

    private static boolean isPrime(long number) {
        for (int i = 2; i <= Math.sqrt(number) ; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long solve() {
        List<Long> factors = new ArrayList<>();
        for (long i = (long)Math.sqrt(NUMBER); i >= 1; --i) {
            if (NUMBER % i == 0) {
                if(isPrime(i)) {
                    return i;
                }

                if (isPrime(NUMBER / i)) {
                    factors.add(NUMBER / i);
                }
            }
        }

        return factors.get(factors.size() - 1);
    }
}
