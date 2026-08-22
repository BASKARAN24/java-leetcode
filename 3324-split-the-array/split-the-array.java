class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            if(i>2)return false;
        }
        return true;
    }
}