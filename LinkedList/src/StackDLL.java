public class StackDLL {
    private DoubleLinkedList stack;

    // constructor
    public StackDLL() {
        this.stack = new DoubleLinkedList(999);
    }

    // method isEmpty
    public boolean isEmpty(){
        if (this.stack.getLength() == 1){
            return true;
        } else{
            return false;
        }
    }

    //method push
    public void push(int dataBaru){
        this.stack.addBack(dataBaru);
    }

    // method pop
    public void pop(){
        if (this.isEmpty() == false) {
            int lastIndex = this.stack.getLength() - 1;
            this.stack.deleteIndex(lastIndex);
        }
    }

    // method top
    public int top(){
        Node nodeNow = this.stack.getHead();
        while(nodeNow.getNext() != null){
            nodeNow = nodeNow.getNext();
        }
        return nodeNow.getData();
    }

    // method display
    public void display(){
        if (this.isEmpty() == false) {
            Node nodeNow = this.stack.getHead().getNext();
            while(nodeNow != null){
                System.out.println(nodeNow.getData());
                nodeNow = nodeNow.getNext();
            }
        } else{
            System.out.println("Stack kosong!");
        }

    }

    // setter and getter

    public DoubleLinkedList getStack() {
        return stack;
    }

    public void setStack(DoubleLinkedList stack) {
        this.stack = stack;
    }
}
