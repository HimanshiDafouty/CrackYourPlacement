class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        if(root==null)
        {
            return finalList;
        }
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelNum=queue.size();
            List<Integer> smallList =new ArrayList<>();
            for(int i=0 ; i<levelNum ;i++)
            {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                smallList.add(queue.poll().val);

            }
            finalList.add(smallList);
        }
        return finalList;
    }
}
