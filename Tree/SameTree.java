class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        boolean leftCompare=isSameTree(p.left , q.left);
        boolean rightCompare=isSameTree(p.right , q.right);
        return leftCompare && rightCompare;
        
    }
}
