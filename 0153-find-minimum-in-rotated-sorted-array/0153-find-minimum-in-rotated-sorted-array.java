class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if(arr[l] <= arr[mid]){
                min = Math.min(min,arr[l]);
                l=mid+1;
            }else{
                min=Math.min(min,arr[mid]);
                r=mid-1;
            }
        }
        return min;
    }
}