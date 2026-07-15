class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1)return 1;
        return getGCD(n*n , n*(n+1));
    }
    private int getGCD(int a,int b){
        if(b==0)return a;
        return getGCD(b,b%a);
    }
}