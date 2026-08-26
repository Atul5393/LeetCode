class Solution {
    public int numberOfSubstrings(String s) {
       int hash[]={-1,-1,-1};
       int c=0;
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        hash[ch -'a']=i;
        if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
            c=c+(1+(Math.min(hash[2],Math.min(hash[0],hash[1]))) );
        }
       } 
       return c;
    }
}