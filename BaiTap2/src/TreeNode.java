public class TreeNode<E> {
    public E val;
    public TreeNode<E> left, right;
    public TreeNode(E val) {
        this.val = val;
        this.left = this.right = null;
    }
}
