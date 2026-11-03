class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combination(0,candidates,target, ans, ds);
        return ans;
    }
    public static void combination(int i,int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<Integer>(ds));
            }
            return;
        }
        if(target>=candidates[i]){
            ds.add(candidates[i]);
            combination(i,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        combination(i+1,candidates,target,ans,ds);


    }
}