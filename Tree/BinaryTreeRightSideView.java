class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return result;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0 ; i<size ; i++)
            {
                TreeNode node= queue.poll();
                if(i==size-1)
                {
                    result.add(node.val);
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
        }
        return result;

        
    }
}
