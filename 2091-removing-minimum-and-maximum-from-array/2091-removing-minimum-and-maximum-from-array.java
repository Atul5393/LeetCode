class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex =0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int minOper1 =1;
        int minOper2 =1;
        int minOper3 =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minValue){
                minValue = nums[i];
                minIndex =i;
            }
            if(nums[i]>maxValue){
                maxValue=nums[i];
                maxIndex = i;
            }
        }
        if(minIndex>maxIndex){
            minOper1 = minIndex +1;
        }
        if(minIndex<maxIndex){
            minOper1 = maxIndex +1;
        }
        if(minIndex>maxIndex){
            minOper2 = nums.length - maxIndex;
        }
        if(minIndex<maxIndex){
            minOper2 =  nums.length - minIndex;
        }
        if(minIndex>maxIndex){
            minOper3 = (maxIndex +1) +(nums.length - minIndex);
        }
        if(minIndex<maxIndex){
            minOper3 = (minIndex +1) +(nums.length - maxIndex);
        }
        return Math.min(Math.min(minOper1,minOper2),minOper3);
    }
}