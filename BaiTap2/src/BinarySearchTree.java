import org.w3c.dom.Node;

public class BinarySearchTree <E extends Comparable<E>> {
    private Node root;
    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = (TreeNode<E>) root;

        // Bước 1: Tìm node chứa e
        while (current != null) {
            if (e.compareTo(current.val) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.val) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // Đã tìm thấy node cần xoá
            }
        }

        // Không tìm thấy node chứa e
        if (current == null) return false;

        // Bước 2: Nếu node không có con trái (case 1)
        if (current.left == null) {
            if (parent == null) {
                root = (Node) current.right; // Node cần xoá là root
            } else {
                if (e.compareTo(parent.val) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        } else {
            // Bước 3: Node có con trái (case 2)
            // Tìm node phải nhất trong cây con trái
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            // Gán giá trị rightMost vào current
            current.val = rightMost.val;

            // Xoá rightMost
            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
                parentOfRightMost.left = rightMost.left;
        }

        return true; // Đã xoá thành công
    }

    public TreeNode<E> search(E e) {
        TreeNode<E> current = (TreeNode<E>) root;
        while (current != null) {
            if(e.compareTo(current.val)<0){
                current = current.left;
            }else if(e.compareTo(current.val)>0){
                current = current.right;

            }else {
                return current;
            }
        }
        return null;
    }
}
