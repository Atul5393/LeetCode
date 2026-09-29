class Solution {
    public double myPow(double x, int n) {
        double ans =1.0;
        long temp =n;
        if(temp<0){
            temp =-temp;
        }
        while(temp>0){
            if((temp & 1) !=0){
                ans = ans*x;
            }
            x*=x;
            temp=temp>>1;
        }
        if(n<0){
            ans = 1/ans;
        }
        return ans;
    }
}