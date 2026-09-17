class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        List<Integer> list= new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i:map.values()){
            set.add(i);
        }
        for(int i:set){
            list.add(i);
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--){
            int a = list.get(i);
            for(char ss:map.keySet()){
                if(map.get(ss) == a){
                    int b = a;
                    while(b != 0){
                        sb.append(ss);
                        b--;
                    }
                }
            }
        }
        return sb.toString();
    }
}