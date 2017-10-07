public class Queue {
    private Node head;
    private Node tail;

    public Queue(){
        head = null;
        tail = null;
    }
    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enque(int data){
        Node node = new Node(data);
        if(head == null){
            tail = node;
            head = tail;
        }  else {
            tail.next = node;
            tail = node;
        }
    }

    public void dequeue(){
        if(head == tail) {
            head = null;
        } else {
            head = head.next;
        }
    }

    public void display(){
        Node node = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.data).append(",");
            node = node.next;
        }

        System.out.println("[" + stringBuilder + "]");
    }

    public static void main(String[] srgs) {
     Queue queue = new Queue();
     queue.enque(10);
     queue.enque(20);
     queue.enque(30);
     queue.display();
     queue.dequeue();
     queue.display();
     queue.dequeue();
     queue.display();
     queue.dequeue();
     queue.display();
    }
}
