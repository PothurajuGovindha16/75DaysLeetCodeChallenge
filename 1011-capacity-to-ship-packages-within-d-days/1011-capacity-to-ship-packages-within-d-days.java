class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int l = 1;
        int r = (int)Math.pow(10,9);
        while(l<=r){
            int mid = l + (r-l)/2;
            if(isPossible(days,mid,weights)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
            System.out.println(l+" "+r);
        }
        return l;
    }
    private boolean isPossible(int days , int k, int[] weights){
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            int val = weights[i];
            if(val > k){
                return false;
            }
            if(sum+val > k){
                days--;
                sum = 0;
            }
            sum+=val;
            if(days<=0)return false;
        }
        return true;
    }
}