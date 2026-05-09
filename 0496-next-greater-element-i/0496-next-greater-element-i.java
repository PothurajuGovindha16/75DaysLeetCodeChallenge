class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                st.pop();
            }
            hm.put(nums2[i],st.isEmpty()?-1:nums2[st.peek()]);
            st.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }

        return nums1;
    }
}