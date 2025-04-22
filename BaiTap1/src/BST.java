public class BST {
    TreeNode root;
    void postOrder(TreeNode node) {
        if (node == null)
            return;

        // Duyệt cây con bên trái
        postOrder(node.left);

        // Duyệt cây con bên phải
        postOrder(node.right);

        // In node hiện tại
        System.out.print(node.data + " ");
    }
}
