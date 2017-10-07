public class Stack {
    Node top;
    int length;

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
        length++;
    }

    public void pop() {
        if (top != null) {
            top = top.next;
            length--;
        }
    }

    public void display() {
        Node node = top;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.data).append(",");
            node = node.next;
        }

        System.out.println("[" + stringBuilder + "]");
    }

    public static void main(String [] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.display();
    }
}
