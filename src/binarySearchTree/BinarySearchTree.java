package binarySearchTree;

class Tree{
    class TNode{
        int data;
        TNode left;     //트리의 왼쪽노드
        TNode right;    //트리의 오른쪽 노드
        TNode(int data){
            this.data = data;
        }
    }
    TNode root;
    public void makeTree(int[] a){
        root = makeTreeR(a, 0, a.length-1);
    }

    /**
     * 트리를 만드는 함수
     * @param a
     * @param start
     * @param end
     * @return
     */
    public TNode makeTreeR(int[] a, int start, int end){
        if(start > end) return null;
        int mid = (start+end) /2 ;
        TNode tNode = new TNode(a[mid]);
        tNode.left = makeTreeR(a, start, mid -1);
        tNode.right = makeTreeR(a, mid+1, end);
        return tNode;
    }

    public void searchBTree(TNode tNode, int find){
        if(find < tNode.data){
            System.out.println("Data is smaller than " + tNode.data);
            searchBTree(tNode.left, find);
        }else if(find > tNode.data){
            System.out.println("Data is bigger than " + tNode.data);
            searchBTree(tNode.right, find);
        }else{
            System.out.println("Data found: " + tNode.data);
        }
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = i;
        }

        Tree tree = new Tree();
        tree.makeTree(a);
        tree.searchBTree(tree.root, 2);
    }
}
