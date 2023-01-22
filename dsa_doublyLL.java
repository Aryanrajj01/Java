//Program to add Node at begining and last !!!!

public class dsa_doublyLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node  temp = head;
            head = newNode;
            head.next = temp;
            head.prev = null;
            
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail.prev = head;
            tail = newNode;
        }
    }
    

    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("Empty");
        }
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(" Null ");
    }
    public static void main(String[] args) {
        dsa_doublyLL dl = new dsa_doublyLL();
        dl.addFirst(3);
        dl.display();
        dl.addFirst(2);
        dl.display();
        dl.addFirst(1);
        dl.display();
        dl.addLast(5);
        dl.display();
        
    }
}
