class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int freq[] = new int[size +1];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        int rep=-1;
        int mis =-1;
        for(int i =0;i<size+1;i++){
            if(freq[i]==2){
                rep=i;
            }if(freq[i]==0){
                mis=i;
            }
        }
        return new int[]{rep,mis};
    }
}