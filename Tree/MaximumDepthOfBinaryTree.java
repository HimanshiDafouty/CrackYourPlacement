class Pair
{
    TreeNode node;
    int depth;
    public Pair(TreeNode node , int depth)
    {
        this.node=node;
        this.depth=depth;

    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        /*
        //Recursive Solution
        if(root==null)
        {
            return 0;
        }
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return 1 + Math.max(leftHeight , rightHeight);
        */

        //Iterative Solution
        if(root==null)
        {
            return 0;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root , 1));
        int maximumDepth=0;
        while(!stack.isEmpty())
        {
            Pair pair = stack.pop();
            TreeNode node = pair.node;
            int depth = pair.depth;
            maximumDepth=Math.max(maximumDepth , depth);
            if(node.left!=null)
            {
                stack.push(new Pair(node.left , depth+1) );
            }
            if(node.right!=null)
            {
                stack.push(new Pair(node.right , depth+1) ); 
            }
        }
        return maximumDepth;

        
    }
}
