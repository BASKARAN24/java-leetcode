class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        boolean zero = false;
        for(int i:nums){
            if(i > 0) zero = true;
        }
        if(zero){
            int z_count = 0;
            while(z_count < nums.length){
                count++;
                int min = Integer.MAX_VALUE;
                z_count = 0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i] >0){
                        min = Math.min(min,nums[i]);
                    }
                }
                for(int i=0;i<nums.length;i++){
                    if(nums[i] != 0) nums[i] = nums[i] - min;
                }
                for(int i=0;i<nums.length;i++){
                    if(nums[i] == 0)z_count++;
                }
            }
            return count;
        }
        return 0;
    }
}