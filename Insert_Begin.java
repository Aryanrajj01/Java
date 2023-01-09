class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        //next = null;
    }
}
public class Main {
    static Node insertBeginning(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static void main(String[] args) {
        Node head = null;//linked_list is empty
        head = insertBeginning(head,15);
        head = insertBeginning(head,10);
        head = insertBeginning(head,5);
    }
}
