class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return isPossible(nums,goal)-isPossible(nums,goal-1);
    }
    private int isPossible(int[] nums, int goal){
        int n = nums.length;
        int res=0;
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(l<=r && sum>goal){
                sum-=nums[l];
                l++;
            }
            res+= (r-l+1);
        }
        return res;
    }
}