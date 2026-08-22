class Solution {
    public int findNonMinOrMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Collections.sort(list);
        int min = list.get(0);
        int max = list.get(list.size()-1);
        int a = -1;
        for(int i:list){
            if(i != min && i != max)return i;
        }
        return a;
    }
}