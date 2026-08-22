class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i:nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
            list1.add(i);
        }
        while(min < max){
            if(!list1.contains(min))list2.add(min);
            min++;
        }
        return list2;
    }
}