class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(char ch:t.toCharArray()){
            ans += Math.abs(t.indexOf(ch) - s.indexOf(ch));
        }
        return ans;
    }
}