class Solution {
    public int findMin(int[] arr) {
        // int min=Integer.MAX_VALUE;
        // for(int n:nums){
        //     min=Math.min(min,n);
        // }
        // return min;
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]<arr[r]){
                return arr[l];
            }
            int mid=l+(r-l)/2;
            if(arr[mid]>arr[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return arr[l];
    }
}