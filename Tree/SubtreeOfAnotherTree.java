class Solution {
    private static boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        boolean leftCompare=isSameTree(p.left , q.left);
        boolean rightCompare=isSameTree(p.right , q.right);
        return leftCompare && rightCompare;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot!=null) return false;
        if(root!=null && subRoot==null || root==null && subRoot==null) return true;

        if(isSameTree(root , subRoot)) return true;

        return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
        
    }
}
