public class Main{
    class Node{
        int data;
        Node next;
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
            Node temp = head;
            head  = newNode;
            head.next = temp;
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
            tail = newNode;
        }
    }
    
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current!=null){
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        Main m = new Main();
        m.addFirst(0);
        m.display();
        m.addFirst(1);
        m.display();
        m.addLast(2);
        m.display();
        m.addLast(3);
        m.display();
        
    }
}
