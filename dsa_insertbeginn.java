public class dsa_insertbegin {
    Node head = null;
    class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public void addFirst(int data){
    Node newnode = new Node(data);
    if (head == null){
        head = newnode;
    }
    else{
        Node temp = head;
        head = newnode;
        head.next= temp;
    }
}
public void display(){
    Node current = head;
    if(head == null){
        System.out.println("Node empty");
        return;
    }
    while(current != null){
        System.out.print(current.data + "->");
        current = current.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    dsa_insertbegin sl = new dsa_insertbegin();
    sl.addFirst(2);
    sl.display();
    sl.addFirst(3);
    sl.display();
    sl.addFirst(4);
    sl.display();
}
}

