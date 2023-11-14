import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testPalindromeWithPalindromeWord() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testPalindromeWithNonPalindromeWord() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithMixedCase() {
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testPalindromeWithSpecialCharacters() {
        assertTrue(PalindromeChecker.isPalindrome("Madam, I'm Adam"));
    }

    @Test
    public void testPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testPalindromeWithSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }
}
