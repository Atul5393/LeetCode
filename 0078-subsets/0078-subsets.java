class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int i=0;
       
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        sol(n,i,nums,ans,temp);
        return ans;
        
    }
    public void sol(int n,int i,int[] nums,List<List<Integer>> ans,List<Integer> temp){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        sol(n,i+1,nums,ans,temp);
        temp.remove(temp.size()-1);
        sol(n,i+1,nums,ans,temp);

    }
}