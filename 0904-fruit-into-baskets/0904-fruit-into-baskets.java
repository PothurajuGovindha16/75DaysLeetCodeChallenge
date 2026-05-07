class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res=0;
        for(int r=0;r<n;r++){
            int key=fruits[r];
            hm.put(key,hm.getOrDefault(key,0)+1);
            while(hm.size() > 2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}