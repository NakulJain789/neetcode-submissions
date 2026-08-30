class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length();
        for(int i = 1; i<n ; i++) {
            for( int j = i+1; j<n-i-1 ; j++) {
                if(nums[i]+nums[j] == target ) {
                    return {i,j};
                }
            }
        }
    }
}
