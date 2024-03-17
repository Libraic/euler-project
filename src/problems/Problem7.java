package problems;

public class Problem7 {

    private static final long LIMIT = 10_001L;

    private static boolean isPrime(long number) {
        for (long i = 2; i * i <= number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long solve() {
        long counter = 1;
        long ans = 3;
        while (counter != LIMIT) {
            if (isPrime(ans)) {
                ++counter;
            }
            ++ans;
        }

        return --ans;
    }
}
