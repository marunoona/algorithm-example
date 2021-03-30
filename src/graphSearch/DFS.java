package graphSearch;

import java.util.Stack;

/**
 * 깊이 우선 탐색
 * Stack 또는 재귀함수로 구현
 */
public class DFS {
    Graph graph;

    DFS(Graph graph){
        this.graph = graph;
    }

    void searchDfs(){
        searchDfs(0);
    }

    void searchDfs(int index){
        Node root = graph.getNodes()[index];
        Stack<Node> stack  = new Stack<>();
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r = stack.pop();
            for(Node n : r.adjacent){
                if(!n.marked){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visitedPrint(r);
        }
    }

    public void recursiveSearchDfs(Node root){
        if(root == null) return;
        root.marked = true;
        visitedPrint(root);
        //호출이 되지 않은 자식노드들을 출력
        for(Node node : root.adjacent){
            if(!node.marked){
                recursiveSearchDfs(node);
            }
        }
    }

    public void recursiveSearchDfs(int index){
        Node root = graph.getNodes()[index];
        recursiveSearchDfs(root);
    }

    public void recursiveSearchDfs(){
        recursiveSearchDfs(0);
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
        DFS dfs = new DFS(graph);
        //dfs.searchDfs();
        //dfs.searchDfs(3);
        dfs.recursiveSearchDfs();
    }
}
