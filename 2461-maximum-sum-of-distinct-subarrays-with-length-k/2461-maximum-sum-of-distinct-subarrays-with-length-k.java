class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long max = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        int l=0;
        long sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.size()>k || r-l+1>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l]) == 0){
                    hm.remove(nums[l]);
                }
                if(r-l+1 == k && hm.size()==k){
                    max = Math.max(max,sum);
                }
                sum-=nums[l];
                l++;
            }
            if(r-l+1 == k && hm.size()==k){
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}