public class BetterSolution {
     void leftRotate(int arr[], int d) {
          int[] temp = new int[d];
          for (int i = 0; i < d; i++) {
               temp[i] = arr[i];
          }
          int j = 0;
          for (int i = d; i < arr.length; i++) {
               arr[j] = arr[i];
               j++;
          }
          int k = 0;
          for (int i = arr.length - d; i < arr.length; i++) {
               arr[i] = temp[k];
               k++;
          }
     }
}
