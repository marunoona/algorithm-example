package graphSearch;

import java.util.LinkedList;

public class Node{
    int data; //노드
    LinkedList<Node> adjacent;  //인접한 노드들의 관계
    boolean marked; //방문했는지 마킹하는 플래그
    Node(int data){
        this.data = data;
        this.marked = false;
        adjacent = new LinkedList<>();
    }
}
