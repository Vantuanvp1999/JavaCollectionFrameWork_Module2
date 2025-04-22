public class BST {
    Node root;
    public BST() {
        root = null;
    }
    public Node insert(Node root,int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        }else if (key > root.key) {
            root.right = insert(root.right, key);
        }
        return root;

    }
    public void postOrder(Node node) {
        if(node ==null){
            return;}
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }
    public void postOrder(){
        postOrder(root);
    }
    public void buildFromArray(int[] arr) {
        for(int key : arr) {
            root = insert(root, key);
        }

    }


}
