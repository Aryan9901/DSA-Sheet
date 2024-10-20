/**
 * NaiveSolution
 */
public class NaiveSolution {

    static Boolean isSubsetSum(int arr[], int sum) {
        int res = countSubsetSum(arr, arr.length, sum);
        return res == 1 ? true : false;
    }

    static int countSubsetSum(int[] arr, int n, int sum) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }

        return countSubsetSum(arr, n - 1, sum) + countSubsetSum(arr, n - 1, sum - arr[n - 1]);
    }
}
