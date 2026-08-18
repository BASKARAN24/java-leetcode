class Solution {
    public int countDistinctIntegers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int b = 0;
            while(a != 0){
                int rem = a % 10;
                b = b * 10;
                b += rem;
                a /= 10;
            }
            list.add(b);
        }
        Set<Integer> set = new HashSet<>();
        for(int i:list){
            set.add(i);
        }
        return set.size();
    }
}