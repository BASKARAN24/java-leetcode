class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        if(arr.length == 1){
            if(sentence.charAt(0) != sentence.charAt(sentence.length()-1))return false;
            return true;
        }
        String x = arr[0];
        String y = arr[arr.length-1];
        if(x.charAt(0) != y.charAt(y.length()-1))return false;
        for(int i=0;i<arr.length-1;i++){
            String a = arr[i];
            String b = arr[i+1];
            if(a.charAt(a.length()-1) != b.charAt(0))return false;
        }
        return true;
    }
}