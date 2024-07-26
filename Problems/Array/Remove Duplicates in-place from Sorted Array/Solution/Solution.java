class Solution {
     public static int removeDuplicates(int[] nums) {
          int i = 0;
          for (int j = 1; j < nums.length; j++) {
               if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
               }
          }
          return i + 1;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 7, 7, 12, 12, 12, 13, 18 };
          int length = removeDuplicates(arr);
          for (int i = 0; i < length; i++) {
               System.out.print(arr[i] + " ");
          }
     }
}