import mypackage.GenericTree;

public class BasicGenericTreeOperations {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        GenericTree tree = new GenericTree(arr);
        System.out.println("Root Node: " + tree.root.data);
        System.out.println("Tree Size: " + tree.getSize(tree.root));
        tree.display(tree.root);
    }
}