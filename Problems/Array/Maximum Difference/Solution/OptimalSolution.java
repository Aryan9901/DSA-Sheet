/**
 * OptimalSolution
 */
public class OptimalSolution {

    public static int maxDifference(int[] arr) {
        int res = arr[1] - arr[0], minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);
        }
        return res;
    }

}