package problems;

public class Problem6 {

    private static final long LIMIT = 100;

    public static long solve() {
        long sumOfSquares = LIMIT * (LIMIT + 1) * (2 * LIMIT + 1) / 6;
        long squareOfSum = LIMIT * LIMIT * (LIMIT + 1) * (LIMIT + 1) / 4;
        return squareOfSum - sumOfSquares;
    }
}
