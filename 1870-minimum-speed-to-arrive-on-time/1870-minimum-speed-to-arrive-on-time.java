class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (hour <= dist.length - 1) return -1;
        int l = 1;
        int r = (int)Math.pow(10,9);

        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(mid,hour,dist)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        if(l > (int)Math.pow(10,9))return -1;
        return l;
    }
    private boolean isPossible(int speed, double hour, int[] dist) {
        double time = 0;
        for(int i = 0; i < dist.length; i++) {
            if(i == dist.length - 1) {
                time += (double) dist[i] / speed;
            } else {
                time += Math.ceil((double) dist[i] / speed);
            }
            if(time > hour)
                return false;
        }
        return true;
    }
}