class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] arr = new int[nums.length*2];
        int ind = 0;
        for(int i:nums){
            arr[ind++] = i;
        }
        for(int i:nums){
            if(i<10)arr[ind++]=i;
            else{
                StringBuilder sb = new StringBuilder();
                while(i != 0){
                    int rem = i%10;
                    sb.append(rem+"");
                    i /= 10;
                }
                arr[ind++] = Integer.valueOf(sb.toString());
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set.size();
    }
}