class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> map;
        set<int> set;
        for(int i:arr){
            map[i]++;
        }
        for(const auto&pair:map){
            if(set.count(pair.second)>0)return false;
            set.insert(pair.second);
        }
        return true;
    }
};