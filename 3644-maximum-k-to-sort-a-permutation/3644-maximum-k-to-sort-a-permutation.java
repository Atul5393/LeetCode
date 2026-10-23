class Solution {
    public int sortPermutation(int[] nums) {
        int res= 0;
        int forOnce =0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]!=i)&&forOnce==0){
                res = nums[i];
                forOnce =1;
            }
            if(nums[i]!=i&&forOnce==1){
                res &=nums[i];
            }
        }
        return res;
    }
}