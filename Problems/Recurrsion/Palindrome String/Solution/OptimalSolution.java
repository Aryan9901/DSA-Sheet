/**
 * OptimalSolution
 */
public class OptimalSolution {

    boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        boolean flag = true;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

}
