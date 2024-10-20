import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/**
 * OptimalSolution
 */
public class OptimalSolution {

    public List<String> find_permutation(String s) {
        List<String> permutations = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        permute(sb, 0, permutations);
        Collections.sort(permutations);
        return permutations;
    }

    public void permute(StringBuilder str, int i, List<String> perm) {

        if (i == str.length() - 1) {
            perm.add(str.toString());
            return;
        }

        Set<Character> seen = new HashSet<>();
        for (int j = i; j < str.length(); j++) {
            if (seen.contains(str.charAt(j))) {
                continue;
            }

            seen.add(str.charAt(j));
            swap(str, i, j);
            permute(str, i + 1, perm);
            swap(str, i, j);
        }
    }

    public void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
}
