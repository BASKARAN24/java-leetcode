class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ind = 0;
        for(int i:nums){
            if(!set.contains(i)){
                nums[ind++] = i;
                set.add(i);
            }
        }
        for(int i=ind;i<nums.length;i++){
            nums[i] = '-';
        }
        return set.size();
    }
}