class BetterSolution {
     
     public int missingNumber(int[] nums) {
         int xor = -1;
         int i =0;
         for(i =0 ;i<=nums.length;i++){
             xor ^= i;
         }
         for(i=0;i<nums.length;i++){
             xor ^= nums[i];
         }
         return xor^-1;
     }
 }
