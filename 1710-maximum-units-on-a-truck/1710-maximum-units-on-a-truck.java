class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> Integer.compare(b[1],a[1]));
        int  boxes =0;
        for(int i=0;i<boxTypes.length&&truckSize>0;i++){
            if(truckSize>=boxTypes[i][0]){
                boxes += boxTypes[i][0]*boxTypes[i][1];
                truckSize -=boxTypes[i][0];
            }else{
                boxes += truckSize*boxTypes[i][1];
                return boxes;
            }
        }
        return boxes; 
        
    }
}