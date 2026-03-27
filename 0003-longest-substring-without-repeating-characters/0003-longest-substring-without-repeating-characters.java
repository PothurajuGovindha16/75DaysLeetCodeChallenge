class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int l=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            while(hm.containsKey(ch)){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                if(hm.get(s.charAt(l)) == 0){
                    hm.remove(s.charAt(l));
                }
                l++;
            }
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}