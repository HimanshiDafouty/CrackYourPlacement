class Solution {
    private static void calculateSum(TreeNode root , int[]sum)
    {
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            sum[0]+=root.left.val;
        }
        calculateSum(root.left , sum);
        calculateSum(root.right, sum);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int sum[]=new int[1];
        calculateSum(root , sum);
        return sum[0];
        
    }
}
 
