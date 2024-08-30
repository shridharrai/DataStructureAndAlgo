package mypackage;
import java.util.ArrayList;

public class Node {
    public int data;
    public ArrayList<Node> children;

    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}