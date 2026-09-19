class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)%k == 0)ans += i;
        }
        return ans;
    }
}