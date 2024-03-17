package problems;

public class Problem4 {

    private static final int UPPER_LIMIT = 999;
    private static final int LOWER_LIMIT = 100;

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    public static int solve() {
        int largestPalindrome = 0;
        for (int i = UPPER_LIMIT; i >= LOWER_LIMIT; --i) {
            for (int j = UPPER_LIMIT; j >= LOWER_LIMIT; --j) {
                int product = i * j;
                if (isPalindrome(Integer.toString(product))) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product;
                    }
                }
            }
        }

        return largestPalindrome;
    }
}
