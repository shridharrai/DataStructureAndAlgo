import mypackage.*;

public class HeightOfGenericTree {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        GenericTree tree = new GenericTree(arr);

        int height = getHeight(tree.root);
        System.out.println(height);
    }

    public static int getHeight(Node node) {
        int height = -1;

        for(Node child: node.children) {
            int childHeight = getHeight(child);
            height = Math.max(height, childHeight);
        }
        height += 1;

        return height;
    }
}