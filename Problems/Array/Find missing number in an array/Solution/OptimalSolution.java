public class OptimalSolution {
     public int missingNumber(int[] nums) {
          int sum = 0, currentSum = 0;
          sum = (nums.length * (nums.length + 1)) / 2;
          for (int i = 0; i < nums.length; i++) {
               currentSum += nums[i];
          }
          return sum - currentSum;
     }
}