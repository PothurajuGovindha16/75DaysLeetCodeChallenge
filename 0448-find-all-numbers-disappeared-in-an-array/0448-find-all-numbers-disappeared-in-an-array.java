class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int num:nums){
            hs.add(num);
        }

        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}