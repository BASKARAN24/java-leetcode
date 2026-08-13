class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'E')count++;
            else {
                max = Math.max(count,max);
                count --;
            }
        }
        max = Math.max(count,max);
        return max;
        // int ec = 0;
        // int m_ec = 0;
        // int lc = 0;
        // int m_lc = 0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) == 'E')ec++;
        //     else{
        //         m_ec = Math.max(ec,m_ec);
        //         ec = 0;
        //     }
        // }
        // m_ec = Math.max(ec,m_ec);
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) == 'L')lc++;
        //     else{
        //         m_lc = Math.max(lc,m_lc);
        //         lc = 0;
        //     }
        // }
        // m_lc = Math.max(lc,m_lc);
        // return Math.max(m_ec,m_lc);
    }
}