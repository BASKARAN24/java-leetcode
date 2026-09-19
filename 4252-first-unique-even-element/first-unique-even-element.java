class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i:nums){
            if(i%2 == 0)map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i) == 1)return i;
        }
        return -1;
    }
}