class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n==1)return s;
        int[] chars = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            chars[ch-'a']++;
        }
        char middle = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            while(chars[i]>=2){
                sb.append((char)('a'+i));
                chars[i]-=2;
            }
            if(chars[i] == 1){
                middle = (char)('a'+i);
            }
        }
        StringBuilder res = new StringBuilder(sb);
        if(middle != 0){
            res.append(middle);
        }
        res.append(sb.reverse().toString());
        return res.toString();
    }
}