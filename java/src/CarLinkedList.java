public class CarLinkedList {
    private CarNode head;
    private int size;

    public CarLinkedList(){
        this.head = null;
        this.size = 0;
    }

    class CarNode {
        private int data;
        private CarNode next;

        public CarNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public CarNode addTail(int data) {
        CarNode node = new CarNode(data);
        if(head == null) {
           head = node;
           size++;
           return node;
        } else {
            CarNode n = head;
            while(n.next != null) {
                n = n.next;
            }

            n.next = node;
            size ++;
            return node;
        }
    }

    public void addHead(int data) {
        CarNode node = new CarNode(data);
        node.next = head;
        head = node;
    }

    public void removeHead(){
        head = head.next;
    }

    public CarNode removeNode(int data){
        CarNode node = head;

        if(head.data == data){
            head = head.next;
            return head;
        }
        while(node.next != null){
            if(node.next.data == data){
                node.next = node.next.next;
                return node;
            }
            node = node.next;
        }
        return node;
    }
    public void display(){
        CarNode node = head;
        while(node != null) {
            System.out.println(node.data+ ",");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        CarLinkedList carLinkedList = new CarLinkedList();
        carLinkedList.addTail(10);
        carLinkedList.addTail(20);
        carLinkedList.addTail(40);
        carLinkedList.addTail(30);
        carLinkedList.addHead(5);
        carLinkedList.display();
        carLinkedList.removeNode(30);
        System.out.println("==================");
        carLinkedList.display();
    }
}



