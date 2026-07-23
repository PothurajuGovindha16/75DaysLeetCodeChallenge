class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return isPossible(nums,k)-isPossible(nums,k-1);
    }
    private int isPossible(int[] nums, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;

        int res=0;
        int l=0;
        for(int r=0;r<n;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            res+=(r-l+1);
        }
        return res;
    }
}