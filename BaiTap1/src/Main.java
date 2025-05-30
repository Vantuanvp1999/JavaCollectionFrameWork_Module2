//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    BST tree = new BST();
        tree.root = new TreeNode(27);
        tree.root.left = new TreeNode(14);
        tree.root.right = new TreeNode(35);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right = new TreeNode(19);
        tree.root.right.left = new TreeNode(31);
        tree.root.right.right = new TreeNode(42);
        System.out.println("postOrder traversal : ");
        tree.postOrder(tree.root);
        tree.preOrder(tree.root);
    }
}