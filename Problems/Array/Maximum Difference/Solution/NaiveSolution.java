
/**
 * NaiveSolution
 */
import java.util.Arrays;

public class NaiveSolution {

    public static int maxDifference(int[] arr) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }

        return res;
    }
}