class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(r-l+1 > k){
                sum-=nums[l];
                l++;
            }
            if(r-l+1 == k){
                System.out.println(sum);
                max=Math.max(max,sum/(double)k);
            }
        }
        return max;
    }
}