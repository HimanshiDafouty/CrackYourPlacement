class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode leftNode = root.left;
        root.left = root.right;
        root.right = leftNode;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;    
    }
}
