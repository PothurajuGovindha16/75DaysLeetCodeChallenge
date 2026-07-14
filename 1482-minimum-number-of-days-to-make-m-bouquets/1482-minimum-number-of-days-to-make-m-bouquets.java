class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l = 1 ;
        int r = (int)Math.pow(10,9);

        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(mid,m,k,bloomDay)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        if(l > (int)Math.pow(10,9))return -1;
        return l;
    }
    private boolean isPossible(int mid,int m,int k,int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int val = arr[i];

            if(val > mid){
                count = 0;
            }else{
                count++;
            }
            if(count == k){
                m--;
                count = 0;
            }
        }
        return m<=0;
    }
}