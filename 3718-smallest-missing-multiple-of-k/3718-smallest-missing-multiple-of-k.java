class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> mapp = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                 mapp.add(nums[i]);
            }
        }
        for(int i=1;i<=101;i++){
            if(!mapp.contains(i*k)){
                return i*k;
            }
        }
        return -1;
    }
}