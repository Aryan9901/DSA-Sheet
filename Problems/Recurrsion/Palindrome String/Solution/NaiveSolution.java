public class NaiveSolution {

    boolean isPalindrome(String S) {
        return isPalindromeString(S, 0, S.length() - 1);
    }

    boolean isPalindromeString(String s, int l, int r) {
        if (l >= r)
            return true;

        return ((s.charAt(l) == s.charAt(r)) && isPalindromeString(s, ++l, --r));
    }

}
