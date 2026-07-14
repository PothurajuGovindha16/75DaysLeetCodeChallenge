class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(hm.containsKey(rem)){
                res = Math.max(res , i-hm.get(rem));
            }else{
                hm.put(rem,i);
            }
        }
        System.out.println(res);
        return res>=2;
    }
}