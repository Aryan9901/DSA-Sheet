public class OptimalSolution {
     public void rotate(int[] nums, int k) {
          // Handle cases where k is greater than the length of the array
          k = k % nums.length;
          reverse(nums, 0, nums.length - 1);
          reverse(nums, 0, k - 1);
          reverse(nums, k, nums.length - 1);
     }

     // Reverses elements in the array from index low to high
     private void reverse(int[] arr, int low, int high) {
          while (low < high) {
               swap(arr, low, high);
               low++;
               high--;
          }
     }

     // Swaps elements in the array at indices f and s
     private void swap(int[] arr, int f, int s) {
          int temp = arr[f];
          arr[f] = arr[s];
          arr[s] = temp;
     }
}
