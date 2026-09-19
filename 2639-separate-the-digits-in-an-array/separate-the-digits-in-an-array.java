class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(i<10){
                list.add(i);
            }
            else{
                String s = i+"";
                int j = 0;
                while(j<s.length()){
                    list.add(Integer.parseInt(s.charAt(j)+""));
                    j++;
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