class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int freq=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ele=nums[i];
            }if(nums[i]==ele){
                freq++;
            }else{
                freq--;
            }
        }
        return ele;
    }
}