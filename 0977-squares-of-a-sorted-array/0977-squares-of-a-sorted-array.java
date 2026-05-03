class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int n=nums.length;
        int[] ans=new int[n];
        int k=n-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[k--]=nums[l]*nums[l];
                l++;
            }else{
                ans[k--]=nums[r]*nums[r];
                r--;
            }
        }
       
        return ans;
    }
}