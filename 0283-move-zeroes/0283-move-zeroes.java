class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,i=0;
        while(i<nums.length){
            if(nums[i] !=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
                i++;
            }else{
                i++;
            }
        }
    }
}