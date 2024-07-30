import java.util.ArrayList;

/**
 * NaiveSolution
 */
public class NaiveSolution {

    public ArrayList<Integer> findUnionOfArrays(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < n && j < m) {
            // Skip duplicates in arr1
            while (i > 0 && i < n && arr1[i] == arr1[i - 1])
                i++;
            // Skip duplicates in arr2
            while (j > 0 && j < m && arr2[j] == arr2[j - 1])
                j++;

            // Check boundaries again after skipping duplicates
            if (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    newArr.add(arr1[i]);
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    newArr.add(arr2[j]);
                    j++;
                } else {
                    newArr.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        // Store remaining elements of arr1
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                newArr.add(arr1[i]);
            }
            i++;
        }

        // Store remaining elements of arr2
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                newArr.add(arr2[j]);
            }
            j++;
        }

        return newArr;
    }
}