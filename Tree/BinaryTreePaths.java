class Solution {
    private static void binaryTreePathHelper(TreeNode node , String path , List<String> result)
    {
        if(node==null)
        {
            return;
        }
        path+=node.val;
        if(node.left==null && node.right==null)
        {
            result.add(path);
        }
        else
        {
            path += "->";
            binaryTreePathHelper(node.left , path ,result);
            binaryTreePathHelper(node.right , path ,result);
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root!=null)
        {
            binaryTreePathHelper(root , "" ,result);
        }
        return result;
        
    }
}
