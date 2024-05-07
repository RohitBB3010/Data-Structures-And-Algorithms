import java.util.Scanner;

public class MinMovesToEmptyString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Size of the string
            String s = scanner.next(); // The string

            // Calculate and print the minimum number of moves required
            System.out.println(minMovesToEmpty(s));
        }

        scanner.close();
    }

    public static int minMovesToEmpty(String s) {
        // If the string is already a palindrome
        if (isPalindrome(s)) {
            // Find the longest contiguous subsequence of the same character
            int longestSubsequenceLength = 1;
            int currentSubsequenceLength = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentSubsequenceLength++;
                } else {
                    longestSubsequenceLength = Math.max(longestSubsequenceLength, currentSubsequenceLength);
                    currentSubsequenceLength = 1;
                }
            }
            longestSubsequenceLength = Math.max(longestSubsequenceLength, currentSubsequenceLength);

            // If the longest subsequence length is less than or equal to 2, return 1, else return 2
            return longestSubsequenceLength <= 2 ? 1 : 2;
        } else {
            // If the string is not already a palindrome, return 2
            return 2;
        }
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
