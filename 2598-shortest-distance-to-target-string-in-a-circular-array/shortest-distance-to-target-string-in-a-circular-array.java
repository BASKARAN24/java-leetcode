class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int distance = Math.abs(i-startIndex);
                distance = Math.min(distance,words.length - distance);

                min = Math.min(min,distance);
            }
        }
        return min == Integer.MAX_VALUE ? -1:min;
    }
}