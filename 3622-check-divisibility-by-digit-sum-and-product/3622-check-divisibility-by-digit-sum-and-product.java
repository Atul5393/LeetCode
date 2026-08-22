class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product =1;
        int num =n;
        if(n==0){
            return false;
        }
        while(n>0){
            sum += n%10;
            product *= n%10;
            n = n/10;
        }
        return (num%(sum+product))== 0;
    }
}