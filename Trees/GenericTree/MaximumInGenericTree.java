import mypackage.*;

public class MaximumInGenericTree {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        GenericTree tree = new GenericTree(arr);

        int max = getMax(tree.root);
        System.out.println(max);
    }

    public static int getMax(Node node) {
        int max = Integer.MIN_VALUE;

        for(Node child: node.children) {
            int childMax = getMax(child);
            if(childMax > max) {
                max = childMax;
            }
        }
        max = Math.max(max, node.data);

        return max;
    }
}