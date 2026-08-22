class Solution {
    public int maxPower(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i) == s.charAt(i+1))sb.append(s.charAt(i+1));
            else {
                list.add(sb.toString());
                sb.setLength(0);
                sb.append(s.charAt(i));
            }
        }
        list.add(sb.toString());
        int max = 0;
        for(String ss:list){
            max = Math.max(max,ss.length());
        }
        return max;
    }
}