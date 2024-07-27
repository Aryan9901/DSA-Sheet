class NaiveSolution {
     void leftRotate(int arr[], int d) {
          for (int i = 0; i < d; i++) {
               arr = rotateByOne(arr);
          }
     }

     int[] rotateByOne(int[] arr) {
          int temp = arr[0];
          for (int i = 0; i < arr.length - 1; i++) {
               arr[i] = arr[i + 1];
          }
          arr[arr.length - 1] = temp;
          return arr;
     }
}