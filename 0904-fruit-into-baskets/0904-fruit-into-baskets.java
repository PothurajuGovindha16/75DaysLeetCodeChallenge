class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int l=0;
        int res=0;
        for(int r=0;r<n;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.size()>2){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}