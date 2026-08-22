class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        while(n != 0){
            int rem = n%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            n /= 10;
        }
        int min = Integer.MAX_VALUE;
        int ele = 1;
        for(int i:map.keySet()){
            if(map.get(i)<min){
                ele = i;
                min = map.get(i);
            }
        }
        return ele;
    }
}