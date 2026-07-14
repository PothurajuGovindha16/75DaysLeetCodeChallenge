class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = (int)Math.pow(10,9);

        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(mid,m,position)){
                l=mid+1;
            }else{
                r=mid-1;
            }
            System.out.println(l+" "+r);
        }
        return r;
    }
    private boolean isPossible(int k,int m,int[] arr){
        int put = 0;
        m--;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[put] - arr[i]) >= k){
                put = i;
                m--;
            }
            if(m<=0)return true;
        }
        return false;
    }
}