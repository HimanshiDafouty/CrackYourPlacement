class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        targetSum= targetSum - root.val;
        //Leaf Node
        if(root.left==null && root.right==null)
        {
            return targetSum==0;
        }
        //move to left
        boolean left=hasPathSum(root.left,  targetSum);
        //move to right
        boolean right=hasPathSum(root.right,  targetSum);
        return left || right;
    }
}
/* 
class Pair
{
    TreeNode node;
    int currentSum;
    Pair(TreeNode node , int currentSum)
    {
        this.node=node;
        this.currentSum=currentSum;
    }
}
class Solution {
    //Iterative Solution
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        {
            return false;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root , 0));
        while(!stack.isEmpty())
        {
            Pair pair = stack.pop();
            TreeNode node=pair.node;
            int currentSum = pair.currentSum;
            currentSum+=node.val;
            //Reach to leaf node
            if(node.left==null && node.right==null)
            {
                if(currentSum == targetSum)
                {
                    return true;
                }
             
            }
            if(node.left!=null)
            {
                stack.push(new Pair(node.left , currentSum));
            }
            if(node.right!=null)
            {
                stack.push(new Pair(node.right , currentSum));
            }
        }
        return false;

    }
}
*/

/* 
//Recursive Solution
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root , 0 , targetSum);
        
    }
    boolean helper(TreeNode root , int sum , int targetSum)
    {
        //base case
        if(root == null)
        {
            return false;
        }
        sum += root.val;
        if(root.left== null && root.right==null)
        {
            return sum == targetSum;
        }
     
        //move to the left
        boolean leftResult = helper(root.left , sum , targetSum);
        //move to the right
        boolean rightResult = helper(root.right , sum , targetSum);
        return leftResult || rightResult;

    }
}
*/
