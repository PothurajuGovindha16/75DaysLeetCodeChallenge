class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb.toString());
        return sb.toString().equals(sb.reverse().toString());
    }
}