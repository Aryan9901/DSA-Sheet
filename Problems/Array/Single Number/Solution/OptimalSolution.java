public class OptimalSolution {
     public int singleNumber(int[] nums) {
          int single = 0;
          for (int i = 0; i < nums.length; i++) {
               single ^= nums[i];
          }
          return single ^ 0;
     }
}