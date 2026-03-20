class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        Set<Integer> sortedSet = new TreeSet<>(hs);
        int i=0;
        for(int key:sortedSet ){
            nums[i++]=key;
        }
        return hs.size();
    }
}