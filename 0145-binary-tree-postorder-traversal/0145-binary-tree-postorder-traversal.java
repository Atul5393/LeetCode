/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ArrayList postOrder(TreeNode root,ArrayList res){
        if(root!=null){
            postOrder(root.left,res);
            postOrder(root.right,res);
            res.add(root.val);
            
        }
        return res;
        
    }
    public List<Integer> postorderTraversal(TreeNode root) {

        ArrayList res = new ArrayList<Integer>();
        postOrder(root,res);
        return res;
        
    }
}