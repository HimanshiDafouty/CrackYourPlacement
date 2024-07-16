class Solution {
    public void flatten(TreeNode root) {
        TreeNode currentNode = root;
        while (currentNode != null) {
            if (currentNode.left != null) {
                TreeNode previousNode = currentNode.left;
                while (previousNode.right != null) {
                    previousNode = previousNode.right;
                }
                previousNode.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }
}

//Iterative Approach
/*
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode currentNode=stack.pop();
            if(currentNode.right!=null)
            {
                stack.push(currentNode.right);
            }
            if(currentNode.left!=null)
            {
                stack.push(currentNode.left);
            }
            if(!stack.isEmpty())
            {
                currentNode.right=stack.peek();
            }
            currentNode.left=null;
        }
        
    }
}
*/
//Recursive Approach 
/*
class Solution {
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null) return ;
        flatten(root.right);
        flatten(root.left);

        root.right=prev;
        root.left=null;
        prev=root;
        
    }
}
 */
