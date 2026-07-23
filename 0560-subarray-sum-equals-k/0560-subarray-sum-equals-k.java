class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int res = 0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

            int rem = sum-k;
            if(hm.containsKey(rem)){
                res+=hm.get(rem);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return res;
    }
}