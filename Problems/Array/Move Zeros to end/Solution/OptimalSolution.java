
public class OptimalSolution {

     public void moveZeroes(int[] nums) {
          int j = -1;
          if (nums.length < 2) {
               return;
          }
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] == 0) {
                    j = i;
                    break;
               }
          }
          if (j == -1) {
               return;
          }
          for (int i = j + 1; i < nums.length; i++) {
               if (nums[i] != 0) {
                    swap(nums, i, j);
                    j++;
               }
          }
     }

     void swap(int[] arr, int first, int last) {
          int temp = arr[first];
          arr[first] = arr[last];
          arr[last] = temp;
     }
}