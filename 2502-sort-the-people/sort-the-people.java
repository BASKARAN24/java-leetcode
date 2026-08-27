class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        String[] arr = new String[names.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
            list.add(heights[i]);
        }
        list.sort(Comparator.reverseOrder());
        int ind = 0;
        for(int i:list){
            for(int j:map.keySet()){
                if(j == i)arr[ind++] = map.get(j);
            }
        }
        return arr;
    }
}