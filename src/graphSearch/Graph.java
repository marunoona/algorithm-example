package graphSearch;

public class Graph {
    Node[] nodes;   //노드들을 저장할 배열
    Graph(int size){
        nodes = new Node[size];
        for(int i = 0; i < size; i++){
            nodes[i] = new Node(i);
        }
    }

    public Node[] getNodes() {
        return nodes;
    }

    /**
     * 두 노드의 관계를 저장하는 메소드
     * @param i1
     * @param i2
     */
    void addEdge(int i1, int i2){
        //데이터가 배열의 인덱스와 같아서 받은 숫자를 인덱스로 사용
        Node node1 = nodes[i1];
        Node node2 = nodes[i2];
        if (!node1.adjacent.contains(node2)) {
            node1.adjacent.add(node2);
        }
        if(!node2.adjacent.contains(node1)){
            node2.adjacent.add(node1);
        }
    }
}
