/**
 * OptimalSolution
 */
public class OptimalSolution {
     public int findMaxConsecutiveOnes(int[] nums) {
          int maxCount = 0, curr = 0;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] == 1) {
                    curr++;
               } else {
                    if (curr > maxCount)
                         maxCount = curr;
                    curr = 0;
               }
          }
          maxCount = Math.max(maxCount, curr);
          return maxCount;
     }
}