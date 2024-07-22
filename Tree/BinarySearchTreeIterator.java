class BSTIterator {
    private Stack<TreeNode> stack =new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
        
    }
    public int next() {
        TreeNode tempNode=stack.pop();
        pushAll(tempNode.right);
        return tempNode.val;
        
    }
    public boolean hasNext() {
        return !stack.isEmpty();
        
    }
    private void pushAll(TreeNode node){  //It
        // for(;node !=null ;stack.push(node) , node=node.left);
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
    /*pushAll is an instance method, it operates on the instance of BSTIterator, allowing it to mani
