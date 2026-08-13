class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Integer> set = new HashSet<>();
		Set<Character> set1 = new HashSet<>();
        int count = 0;
        for(char ch:word.toCharArray()){
            int a = ch;
            set.add(a);
        }
        for(char ch:word.toCharArray()){
            set1.add(ch);
        }
        for(char ch:set1){
            int a = ch;
                if(a<97){
                if(set.contains(a+32)){
                    count++;
                }
            }
            else{
                if(set.contains(a-32)){
                    count++;
                }
            }
            
        }
        return (count/2);
    }
}