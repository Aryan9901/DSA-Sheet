class Solution {
     public static boolean check(int[] nums) {
          if (isSorted(nums)) {
               return true;
          }
          for (int i = 0; i < nums.length; i++) {
               nums = rotateTheArray(nums);
               if (isSorted(nums)) {
                    return true;
               }
          }
          return false;
     }

     private static int[] rotateTheArray(int[] arr) {
          int temp = arr[0];
          for (int i = 1; i < arr.length; i++) {
               arr[i - 1] = arr[i];
          }
          arr[arr.length - 1] = temp;
          return arr;
     }

     public static boolean isSorted(int[] arr) {
          if (arr.length < 2) {
               return true;
          }
          for (int i = 1; i < arr.length; i++) {
               if (arr[i] < arr[i - 1])
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {
          int[] arr = { 3, 4, 5, 1, 2, 3 };
          System.out.println(check(arr));
     }
}