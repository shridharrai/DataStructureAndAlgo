package mypackage;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node node) {
        this.head = node;
    }

    public Node getTail() {
        return this.tail;
    }

    public void setTail(Node node) {
        this.tail = node;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (size == 1) {
            int removedItemData = head.data;
            head = tail = null;
            size = 0;
            return removedItemData;
        } else {
            int removedItemData = head.data;
            head = head.next;
            size--;
            return removedItemData;
        }
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return tail.data;
        }
    }

    public int getAt(int idx) {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
            return -1;
        } else {
            Node temp = head;
            for (int i = 0; i < idx; ++i) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void addFirst(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;

        if (size == 0) {
            tail = newNode;
        }

        size++;
    }

    public void addAt(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid arguments");
        } else if (idx == 0) {
            addFirst(val);
        } else if (idx == size) {
            addLast(val);
        } else {
            Node newNode = new Node();
            newNode.data = val;

            Node temp = head;
            for (int i = 0; i < idx - 1; ++i) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            for (int i = 0; i < size - 2; ++i) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void removeAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid arguments");
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; ++i) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            size--;
        }
    }
}
