class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        unordered_map<int,int> map;
        set<int> set;
        for(int i:nums){
            if(i%2 == 0){
                map[i]++;
            }
        }
        if(map.size() == 0)return -1;
        int max = 0;
        for(const auto&pair:map){
            if(pair.second > max){
                max = pair.second;
            }
        }
        for(const auto & pair : map){
            if(map[pair.first] == max)set.insert(pair.first);
        }
        for(int i:set){
            return i;
        }
        return 0;
    }
};