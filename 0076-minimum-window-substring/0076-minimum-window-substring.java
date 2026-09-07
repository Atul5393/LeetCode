class Solution {
    
    public String minWindow(String s, String t) {
        int hash[] = new int[256];
        int minlen = Integer.MAX_VALUE;
        int n = s.length();
        int m = t.length();
        int count =0;
        int r=0;
        int l =0;
        int startIndex =-1;
        for(int i =0;i<m;i++){
            char ch =t.charAt(i);
            hash[ch-'A']++;
        }
        while(r<n){
            if(hash[s.charAt(r)-'A']>0){
                count++;
                
            }
            hash[s.charAt(r)-'A']--;
            while(count == m){
                if(r-l+1<minlen){
                    minlen = r-l+1;
                    startIndex = l;

                }
                hash[s.charAt(l)-'A']++;
                if( hash[s.charAt(l)-'A']>0){
                    count--;
                }
                l++;
            }
            r++;

        }
       return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minlen);

    }
}