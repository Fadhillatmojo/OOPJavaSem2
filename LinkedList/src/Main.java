public class Main {
    public static void main(String[] args) {
        DoubleLinkedList linkedList1 = new DoubleLinkedList();
        linkedList1.addFront(5);
        linkedList1.addFront(4);
        linkedList1.addFront(3);
        linkedList1.addBack(6);
        linkedList1.addBack(8);
        linkedList1.addBack(100);
        linkedList1.addAfter(6, 7);
        linkedList1.deleteData(6);
        linkedList1.printDLL();

        // sout
        System.out.println();
        DoubleLinkedList linkedList2 = new DoubleLinkedList(15);
        linkedList2.addBack(1);
        linkedList2.addBack(100);
        linkedList2.addBack(102);
        linkedList2.printDLL();

//         stack
        System.out.println();
        StackDLL stack1 = new StackDLL();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.pop();
        stack1.display();
        System.out.println("Ini top nya: " + stack1.top());

    }
}