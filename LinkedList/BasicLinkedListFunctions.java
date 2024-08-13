public class BasicLinkedListFunctions {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int size() {
            return size;
        }

        public void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void addLast(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if(size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            size++;
        }

        public void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if(idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for(int i = 0; i < idx; ++i) {
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

            if(size == 0) {
                tail = newNode;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if(idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if(idx == 0) {
                addFirst(val);
            } else if(idx == size) {
                addLast(val);
            } else {
                Node newNode = new Node();
                newNode.data = val;

                Node temp = head;
                for(int i = 0; i < idx - 1; ++i) {
                    temp = temp.next;
                }

                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }

        public void removeLast() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for(int i = 0; i < size - 2; ++i) {
                    temp = temp.next;
                }

                temp.next = null;
                tail = temp;
                size--;
            }
        }

        public void removeAt(int idx) {
            if(idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if(idx == 0) {
                removeFirst();
            } else if(idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for(int i = 0; i < idx - 1; ++i) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        } 
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.size());
        list.display();
        
        // list.removeFirst();
        // System.out.println(list.size());
        // list.display();

        // System.out.println(list.getFirst());
        // System.out.println(list.getLast());
        // System.out.println(list.getAt(2));
        // list.getAt(5);
        // list.getAt(-2);

        // list.addFirst(10);
        // list.addFirst(5);

        // list.addAt(0, 10);
        // list.addAt(5, 60);
        // list.addAt(3, 35);

        // list.removeLast();
        list.removeAt(2);
        System.out.println(list.size());
        list.display();
    }
}