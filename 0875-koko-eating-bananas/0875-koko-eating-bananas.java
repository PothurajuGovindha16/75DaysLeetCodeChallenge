class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int r = (int)Math.pow(10,9);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(h,mid,piles)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    private boolean isPossible(int h,int k,int[] piles){
        for(int i=0;i<piles.length;i++){
            int val = piles[i];
            int temp = val/k;
            if(val%k != 0){
                temp++;
            }
            h-=temp;
            if(h<0){
                return false;
            }
        }
        return true;
    }
}