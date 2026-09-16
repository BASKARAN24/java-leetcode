class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 1 && nums[0] == 1)return 2;
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            max = Math.max(max,i);
            set.add(i);
        }
        if(max == 0)return 1;
        int i = 1;
        while(i<= max){
            if(!set.contains(i))return i;
            i++;
        }
        return max+1;
    }
}