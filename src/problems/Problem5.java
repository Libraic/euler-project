package problems;

import java.util.List;
import java.util.ArrayList;

public class Problem5 {

    private static final int THRESHOLD = 20;

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> findPrimes() {
        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= Problem5.THRESHOLD; ++i) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static long solve() {
        List<Integer> primes = findPrimes();
        long smallestMultiple = 1;
        for (int prime : primes) {
            long power = (long) (Math.log(THRESHOLD) / Math.log(prime));
            smallestMultiple *= (long) Math.pow(prime, power);
        }
        return smallestMultiple;
    }
}
