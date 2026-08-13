class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(int i:map.values()){
            if(i == 2)count++;
        }
        if(count == 0)return 0;
        List<Integer> list = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i) == 2)list.add(i);
        }
        int ans = 0;
        for(int i:list){
            ans ^= i;
        }
        return ans; 
    }
}