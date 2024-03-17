package problems;

public class Problem2 {

    private static final int UPPER_LIMIT = 4_000_000;

    public static long solve() {
        long firstTerm = 0, secondTerm = 1, previousSum = 1, ans = 0;
        while (previousSum < UPPER_LIMIT) {
            if (previousSum % 2 == 0) {
                ans += previousSum;
            }
            long temp = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = temp;
            previousSum = firstTerm + secondTerm;
        }

        return ans;
    }
}
