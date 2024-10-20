import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * NaiveSolution
 */

public class NaiveSolution {
    public List<String> AllPossibleStrings(String s) {
        List<String> permutations = new ArrayList<>();
        powerSet(s, "", 0, permutations);
        Collections.sort(permutations);
        return permutations;
    }

    public void powerSet(String str, String curr, int i, List<String> permutations) {
        if (i == str.length()) {
            if (!curr.equals("")) {
                permutations.add(curr);
            }
            return;
        }

        powerSet(str, curr, i + 1, permutations);
        powerSet(str, curr + str.charAt(i), i + 1, permutations);
    }
}
