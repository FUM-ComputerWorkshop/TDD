public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

    String cleanedStr = str.replaceAll("[\\s+.,!?:;'\"-]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama!";
        System.out.println("Is palindrome: " + isPalindrome(testString));
    }
}

