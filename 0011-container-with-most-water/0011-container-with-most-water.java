class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=n-1;

        int max=0;

        while(l<r){
            int water=Math.min(arr[l],arr[r])*(r-l);
            max=Math.max(max,water);
            if(arr[l]<arr[r]){
               l++;
            }else{
                r--;
            }
        }
        return max;
    }
}