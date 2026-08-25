class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int a = emptyBottles;
        int remainingBottles = 0;
        while(emptyBottles >= numExchange){
            remainingBottles = emptyBottles % numExchange;
            emptyBottles = emptyBottles / numExchange;
            a += emptyBottles;
            emptyBottles += remainingBottles
            ;
        }
        return a;
    }
}