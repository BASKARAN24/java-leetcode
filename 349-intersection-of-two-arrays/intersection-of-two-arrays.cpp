class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> list;
        set<int> set;
        unordered_set<int> ans;
        for(int i:nums1){
            set.insert(i);
        }
        for(int i:nums2){
            if(set.count(i) > 0){
                ans.insert(i);
            }
        }
        for(int i:ans){
            list.push_back(i);
        }
        return list;
    }
};