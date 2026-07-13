class Solution {
    public int[] searchRange(int[] arr, int target) {
        int firstIndex = getFirstIndex(arr,target);
        int lastIndex = getLastIndex(arr,target);
        return new int[]{firstIndex,lastIndex};
    }
    private int getFirstIndex(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid] >= target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        if(l>arr.length-1){
            return -1;
        }
        if(arr[l] != target) {
            return -1;
        }
        return l;
    }
    private int getLastIndex(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid] > target){
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(arr[r] != target) {
            return -1;
        }
        return r;
    } 
}