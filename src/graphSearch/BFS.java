package graphSearch;

import queue.Queue;

/**
 * 넓이 우선 탐색
 * Queue 로 구현
 */

public class BFS {
    Graph graph;

    BFS(Graph graph){
        this.graph = graph;
    }

    public void searchBfs(){
        searchBfs(0);
    }
    public void searchBfs(int index){
        Node root = graph.getNodes()[index];
        Queue<Node> queue = new Queue<>();
        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()){
            Node r = queue.remove();
            for(Node node : r.adjacent){
                if(!node.marked){
                    node.marked = true;
                    queue.add(node);
                }
            }
            visitedPrint(r);
        }
    }

    private void visitedPrint(Node n){
        System.out.print(n.data + " ");
    }

    public static void main(String[] args) {
        Graph graph = new Graph(9);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);
        graph.addEdge(5,7);
        graph.addEdge(6,8);
        BFS bfs = new BFS(graph);
        //bfs.searchBfs();
        bfs.searchBfs(3);
    }
}
