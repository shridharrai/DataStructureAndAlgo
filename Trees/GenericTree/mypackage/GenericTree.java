package mypackage;
import java.util.Stack;

public class GenericTree {
    public Node root;

    public GenericTree(int[] arr) {
        constructTree(arr);
    }

    public void constructTree(int[] arr) {
        Stack<Node> stack = new Stack<>();

        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] == -1) {
                stack.pop();
            } else {
                Node newNode = new Node(arr[i]);

                if(stack.size() > 0) {
                    Node currParentNode = stack.peek();
                    currParentNode.children.add(newNode);
                } else {
                    this.root = newNode;
                }

                stack.push(newNode);
            }
        }
    }

    public void display(Node node) {
        String str = node.data + " -> ";
        for(Node child: node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for(Node child: node.children) {
            display(child);
        }
    }

    public int getSize(Node node) {
        int size = 0;

        for(Node child: node.children) {
            int childsSize = getSize(child);
            size = size + childsSize;
        }

        size = size + 1;
        return size;
    }
}