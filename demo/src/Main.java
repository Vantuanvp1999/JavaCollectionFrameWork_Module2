//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] arr = {6,11,22,14,16,7,28,9,10};
        tree.buildFromArray(arr);
        tree.postOrder();
    }
}