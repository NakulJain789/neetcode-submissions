class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0 ; i< n ; i++) {
            if(nums[i] == nums [i-1]) {
                return true;
            }
        }
        return false;
    }
}