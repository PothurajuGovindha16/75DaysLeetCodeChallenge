class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            nse[i]=st.isEmpty() ? 0 : st.peek()-i;
            st.push(i);
        }
        return nse;
    }
}