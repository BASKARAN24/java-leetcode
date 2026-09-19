class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        else if(timer  == 30)return "Orange";
        else if(timer >30 && timer < 91)return "Red";
        return "Invalid";
    }
}