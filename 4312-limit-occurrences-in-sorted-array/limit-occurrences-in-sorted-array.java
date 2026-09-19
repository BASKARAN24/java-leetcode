class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            int b = map.get(i);
            if(b >= k){
                int a = k;
                while(a != 0){
                    list.add(i);
                    a--;
                }
            }
            else {
                while(b != 0){
                    list.add(i);
                    b--;
                }
            }
        }
        int[] arr = new int[list.size()];
        int ind = 0;
        for(int i:list){
            arr[ind++] = i;
        }
        return arr;
    }
}