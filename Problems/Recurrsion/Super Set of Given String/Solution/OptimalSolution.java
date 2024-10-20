import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * OptimalSolution
 */
public class OptimalSolution {

    public List<String> AllPossibleStrings(String s) {
        List<String> permutations = new ArrayList<>(); // Preallocate size for 2^n subsets
        powerSet(s, new StringBuilder(), 0, permutations);
        Collections.sort(permutations);
        return permutations;
    }

    public void powerSet(String str, StringBuilder curr, int i, List<String> permutations) {
        if (i == str.length()) {
            if (curr.length() > 0) {
                permutations.add(curr.toString());
            }
            return;
        }

        curr.append(str.charAt(i));
        powerSet(str, curr, i + 1, permutations);
        curr.deleteCharAt(curr.length() - 1); // Backtrack

        powerSet(str, curr, i + 1, permutations);
    }
}
