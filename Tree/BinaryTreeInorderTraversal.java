class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        TreeNode tempNode =root;
        while(tempNode != null || !stack.isEmpty())
        {
            while(tempNode!=null){
                stack.push(tempNode);
                tempNode =tempNode.left;
            }
            tempNode =stack.pop();
            result.add(tempNode.val);
            tempNode =tempNode.right;  //move to right of current node 
        }
        return result;
        
    }
}
/*
class Solution {
    private static void inOrder(TreeNode root , List<Integer> inorderList )
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left , inorderList);
        inorderList.add(root.val);
        inOrder(root.right , inorderList);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inOrder(root , inorderList);
        return inorderList;
    }
    
}*/
