class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(i%2 == 0)map.put(i,map.getOrDefault(i,0)+1);
        }
        if(map.size() == 0) return -1;
        int max = 0;
        for(int value:map.values()){
            max = Math.max(max,value);
        }
        List<Integer> list = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key) == max)list.add(key);
        }
        Collections.sort(list);
        return list.get(0);
    }
}