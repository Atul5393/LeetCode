class Solution {
    public int minRotations(String s) {
        int minRot=0;
        int totalRot=0;
        int from= 0;
        
        for(int i=0;i<s.length();i++){
            int to= s.charAt(i)-'0';
            minRot = Math.min(Math.abs(to-from),10-Math.abs(to-from));
            totalRot+=minRot;
            from=to;
        }
        return totalRot;

    }
}