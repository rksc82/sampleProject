import java.util.Stack;

public class BinarySearchTreeExample {

    private Node root;

    public BinarySearchTreeExample() {
        this.root = null;
    }

    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.println(" " + root.data);
            display(root.right);
        }
    }

    public boolean isLeaf(Node node){
        return node.left==null ? node.right == null : false;
    }

    public void insert(int data) {
        Node node = new Node(data);
        Node currentNode = root;
        if (root == null) {
            root = node;
        } else {
            while (currentNode != null )
            if (data < currentNode.data) {
                if(currentNode.left == null) {
                    currentNode.left = node;
                    break;
                }
                currentNode = currentNode.left;

            } else {
                if(currentNode.right == null) {
                currentNode.right = node;
                break;
                }
                currentNode = currentNode.right;

            }
        }
    }

    public boolean search(int data) {

        Node currentNode = root;
        while(currentNode != null){
            if(currentNode.data == data){
                return true;
            } else if (data < currentNode.data){
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        return false;
    }

    public void delete() {

    }

    public void inorder(Node root) {
        Stack<Node> stack = new Stack<Node>();

        Node currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                Node n = stack.pop();
                System.out.println(n.data);
                currentNode = n.right;
            }
        }
    }

    public void preorder(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
           Node n =  stack.pop();
           System.out.println(n.data);
           if(n.right != null){
               stack.push(n.right);
           }
           if(n.left != null){
               stack.push(n.left);
           }
        }
    }

    public void postorder(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){

        }
    }

    public static void main(String[] args){
        BinarySearchTreeExample binarySearchtree = new BinarySearchTreeExample();
        binarySearchtree.insert(40);
        binarySearchtree.insert(20);
        binarySearchtree.insert(10);
        binarySearchtree.insert(30);
        binarySearchtree.insert(60);
        binarySearchtree.insert(50);
        binarySearchtree.insert(70);

        binarySearchtree.display(binarySearchtree.root);
        binarySearchtree.preorder(binarySearchtree.root);

        System.out.println(binarySearchtree.search(20));
        System.out.println(binarySearchtree.search(25));

    }
}
