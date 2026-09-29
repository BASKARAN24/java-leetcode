class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split("\\s+");
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < k){
            sb.append(arr[i]+" ");
            i++;
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}