class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0;
        int res=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            if(sum>=target){
                res=Math.min(res,r-l+1);
            }
            while(sum>=target){
                sum-=nums[l];
                l++;
                if(sum>=target)res=Math.min(res,r-l+1);
            }
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}