/**
 * OptimalSolution
 * the idea of optimal solution is that we can pre compute lMax and rMax.
 * 
 */
public class OptimalSolution {
    static long trappingWater(int arr[]) {
        int res = 0;
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];

        lMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }

        rMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], arr[i]);
        }

        for (int i = 1; i < arr.length - 1; i++) {
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }

        return res;
    }
}