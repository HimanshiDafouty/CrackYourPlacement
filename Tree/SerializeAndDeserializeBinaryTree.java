public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> queue =new LinkedList<>();
        StringBuilder result = new StringBuilder();
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if(node==null)
            {
                result.append("null ");
                continue;
            }
            result.append(node.val+" ");
            queue.add(node.left);
            queue.add(node.right);
        }
        return result.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="") return null;
        Queue<TreeNode> queue= new LinkedList<>();
        String[] values =data.split(" ");
        TreeNode rootNode =new TreeNode(Integer.parseInt(values[0]));
        queue.add(rootNode);
        
        for(int i=1 ; i<values.length ;i++)
        {
            TreeNode parentNode =queue.poll();
            if(!values[i].equals("null"))
            {
                TreeNode leftNode =new TreeNode(Integer.parseInt(values[i]));
                parentNode.left=leftNode;
                queue.add(leftNode);
            }
            if(!values[++i].equals("null"))
            {
                TreeNode rightNode =new TreeNode(Integer.parseInt(values[i]));
                parentNode.right=rightNode;
                queue.add(rightNode);
            }
        }
        return rootNode;
        
    }
}
