class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if(arr[i] != arr[j]){
                int a = arr[i];
                int b = arr[j];
                if(a < b){
                    arr[j] = arr[i];
                }
                else arr[i] = arr[j];
                
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}