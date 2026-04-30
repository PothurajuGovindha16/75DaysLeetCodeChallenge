class Solution {
    
    /*public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n == 0)return 0;
        Arrays.sort(nums);
        int res=0;
        int temp=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]==nums[i-1]+1){
                temp++;
                res=Math.max(res,temp);
            }else{
                temp=1;
            }
        }
        return res==0?1:res;
    }*/

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int res=0;
        for(int num:hs){
            int temp=1;
            if(hs.contains(num+1))continue;
            while(hs.contains(num-1)){
                temp++;
                num=num-1;
            }
            res=Math.max(res,temp);
        }
        return res;
    }
}