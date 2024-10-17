/**
 * NaiveSolution
 */
public class NaiveSolution {
    static long trappingWater(int arr[]) {
        int res = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
    }
}