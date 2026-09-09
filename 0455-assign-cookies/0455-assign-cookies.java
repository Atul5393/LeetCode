class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r=0;
        int l =0;
        while(l<g.length&&r<s.length){
            if(g[l]<=s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}