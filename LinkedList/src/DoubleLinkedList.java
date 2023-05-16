public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    // constructor
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public DoubleLinkedList(int data){
        this.head = new Node(data);
        this.tail = this.head;
        this.length = 1;
    }

    // method isempty
    public boolean isEmpty(){
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // method add front
    public void addFront(int newData){
        Node newNode = new Node(newData);
        if (this.isEmpty() == true) {
            this.head = newNode;
            this.tail = this.head;
            this.length++;
        } else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
            this.length++;
        }
    }

    // method add back
    public void addBack(int newData){
        Node newNode = new Node(newData);
        if (this.isEmpty() == true) {
            this.tail = newNode;
            this.head = this.tail;
            this.length++;
        } else{
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.length++;
        }
    }

    // method add after
    public void addAfter(int dataAfter, int newData){
        if (this.isEmpty() == false) {
            Node newNode = new Node(newData);
            Node nodeNow = this.head;
            while (nodeNow.getData() != dataAfter){
                nodeNow = nodeNow.getNext();
            }
            newNode.setPrev(nodeNow);
            newNode.setNext(nodeNow.getNext());
            nodeNow.setNext(newNode);
            newNode.getNext().setPrev(newNode);
            this.length++;
        } else{
            System.out.println("List Kosong!");
        }

    }

    //method delete data
    public void deleteData(int dataDel){
        Node nodeNow = this.head;
        if (this.isEmpty() == false) {
            while (nodeNow.getNext().getData() != dataDel){
                nodeNow = nodeNow.getNext();
            }
            nodeNow.setNext(nodeNow.getNext().getNext());
            nodeNow.getNext().setPrev(nodeNow);
            this.length--;
        } else{
            System.out.println("List kosong!");
        }
    }

    // method delete index ke
    public void deleteIndex(int index){
        if (this.isEmpty() == false){
            Node nodeNow = this.head.getNext();
            for (int i = 0; i < (index - 2); i++) {
                nodeNow = nodeNow.getNext();
            }
            nodeNow.setNext(nodeNow.getNext().getNext());
        }
    }

    // to string
    public void printDLL(){
        if (this.isEmpty() == false) {
            Node nodeNow = this.head;
            while (nodeNow != null){
                System.out.print(nodeNow.getData() + " ");
                nodeNow = nodeNow.getNext();
            }
        } else{
            System.out.println("List kosong!");
        }
        System.out.println();
        System.out.println("Panjang list: " + this.length);

    }

    //getter and setter

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
