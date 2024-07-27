public class OptimalSolution {
     void leftRotate(int arr[], int d) {
          arr = reverse(arr, 0, d - 1);
          arr = reverse(arr, d, arr.length - 1);
          arr = reverse(arr, 0, arr.length - 1);
     }

     int[] reverse(int[] arr, int low, int high) {
          while (low <= high) {
               swap(arr, low, high);
               low++;
               high--;
          }
          return arr;
     }

     void swap(int[] arr, int f, int s) {
          int temp = arr[f];
          arr[f] = arr[s];
          arr[s] = temp;
     }
}
