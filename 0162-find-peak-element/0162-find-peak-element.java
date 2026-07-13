class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        //base case of length=1
        if(n == 1) return 0;
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[n-2]< arr[n-1]){
            return n-1;
        }
        int l = 1;
        int r = n-1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if(mid >0 && mid <n-1 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid < n-1 && arr[mid]<arr[mid+1]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}