class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int l = 0;
        int product =1;
        for(int r=0;r<n;r++){
            product*=nums[r];
            while(l<=r && product >= k){
                product/=nums[l];
                l++;
            }
            res+=(r-l+1);
        }
        return res;
    }
}