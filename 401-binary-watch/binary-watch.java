class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(":");
                    if(j<10){
                        sb.append(0);
                        sb.append(j);
                    }
                    else{
                        sb.append(j);
                    }
                    list.add(sb.toString());
                }
            }
        }
        return list;
    }
}