class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char,string> map;
        stringstream ss(s);
        string word;
        vector<string> list;
        unordered_set<char> set1;
        unordered_set<string> set2;
        while(ss>>word){
            list.push_back(word);
        }
        if(list.size() != pattern.size())return false;
        for(int i=0;i<pattern.size();i++){
            set1.insert(pattern[i]);
        }
        for(int i=0;i<list.size();i++){
            set2.insert(list[i]);
        }
        if(set1.size() != set2.size())return false;
        for(int i=0;i<pattern.size();i++){
            if(map.count(pattern[i])>0 && map[pattern[i]] != list[i])return false;
            map[pattern[i]]=list[i];
        }
        return true;
    }
};