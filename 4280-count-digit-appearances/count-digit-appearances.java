class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i:nums){
            sb.append(i);
        }
        String s = sb.toString();
        String ss = digit+"";
        char c = ss.charAt(0);
        for(char ch:s.toCharArray()){
            if(ch == c)count++;
        }
        return count;
    }
}