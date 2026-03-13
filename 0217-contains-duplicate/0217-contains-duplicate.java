class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i];
            if(hs.contains(val)){
                return true;
            }
            hs.add(val);
        }
        return false;
    }
}