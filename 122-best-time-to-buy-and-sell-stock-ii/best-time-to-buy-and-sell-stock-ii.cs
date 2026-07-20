public class Solution {
    public int MaxProfit(int[] arr) {
        int profit = 0;
        for(int i=1;i<arr.Length;i++){
            if(arr[i]>arr[i-1])profit += arr[i]-arr[i-1];
        }
        return profit;
    }
}