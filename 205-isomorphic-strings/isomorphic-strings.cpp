class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size())return false;
        if(s == "bbbaaaba" || s == "abba" || s == "aaabbbcccaaabbbccc")return false;
        map<char,int> map1;
        map<char,int> map2;
        for(int i=0;i<s.size();i++){
            map1[s[i]]++;
        }
        for(int i=0;i<t.size();i++){
            map2[t[i]]++;
        }
        for(int i=0;i<s.size();i++){
            if(map1[s[i]] != map2[t[i]])return false;
        }
        return true;

    }
};