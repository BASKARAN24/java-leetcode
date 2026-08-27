class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        String[] arr1 = s1.split("\\s+");
        String[] arr2 = s2.split("\\s+");
        for(String s:arr1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:arr2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count = 0;
        for(String s:map.keySet()){
            if(map.get(s) == 1)count++;
        }
        String[] arr = new String[count];
        int ind = 0;
        for(String s:map.keySet()){
            if(map.get(s) == 1)arr[ind++] = s;
        }
        return arr;
    }
}