class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        int res=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int diff=Math.abs(target-sum);
                    if(diff < mini){
                        mini=diff;
                        res=sum;
                    }
                }
            }
        }
        return res;
    }
}