class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int i=height.length-1;
        int j=0;
        while(j<i){
            int wt=i-j;
            int hg = Math.min(height[i],height[j]);

            int curr= wt*hg;
            max=Math.max(max,curr);
        
        if(height[j]<height[i]){
            j++;
        }else{
            i--;
        }
        }
        return max;
    }
}