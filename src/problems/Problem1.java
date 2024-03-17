package problems;

public class Problem1 {

    private static final int UPPER_LIMIT = 1_000;

    public static int solve() {
        int ans = 0;
        for (int i = 3; i < UPPER_LIMIT; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                ans += i;
            }
        }

        return ans;
    }
}
