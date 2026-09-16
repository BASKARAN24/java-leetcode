class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(list.contains(i) && !set.contains(i)){
                list.add(i);
                set.add(i);
            }
            else if(!list.contains(i) && !set.contains(i))list.add(i);
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return list.size();

    }
}