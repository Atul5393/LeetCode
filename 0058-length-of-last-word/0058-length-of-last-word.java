class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
       for(int i = s.length()-1;i>=0;i--){
        char ch = s.charAt(i);
        if(ch!=' '){
            cnt++;
        }
        if(cnt>=1 && ch==' '){
            return cnt;
        }
       } 
       return cnt;
    }
}