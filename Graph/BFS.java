class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> result= new ArrayList<>();
        //visited array
        boolean[] visited =new boolean[V];
        int vertex =0;
        //mark the o vertex as visited
        visited[vertex]=true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(vertex);
        while(!queue.isEmpty()){
            vertex =queue.poll();
            result.add(vertex);
            
            for(int i=0 ;i<adj.get(vertex).size();i++){
                int neighbour =adj.get(vertex).get(i);
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.offer(neighbour);
                }
            }
        }
        return result;
        
    }
}
