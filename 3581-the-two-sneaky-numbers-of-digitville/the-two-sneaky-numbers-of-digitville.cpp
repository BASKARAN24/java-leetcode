class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        vector<int> list;
        set<int> set;
        for(int i:nums){
            if(set.count(i)>0){
                list.push_back(i);
            }
            set.insert(i);
        }
        return list;
    }
};