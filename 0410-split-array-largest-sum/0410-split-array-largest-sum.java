class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0;
        int r = (int)Math.pow(10,9);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(mid,k,nums)){
                r=mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    private boolean isPossible(int mid,int k,int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(val > mid){
                return false;
            }
            if(sum+val > mid){
                k--;
                sum=0;
            }
            sum+=val;
            if(k<=0){
                return false;
            }
        }
        return true;
    }
}