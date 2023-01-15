//public class dsa_deletion{
    //import com.mysql.cj.protocol.x.ContinuousInputStream;

public class dsa_deletion {
    
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
            head = newNode;
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
    public void deleteFifrst(){
        if(head == null){
            System.out.println("List is empty");
            return; 
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; 
    }
    public void display(){
        Node current  = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current !=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        dsa_deletion ds = new dsa_deletion();
        ds.addFirst(2);
        ds.display();
        ds.addFirst(1);
        ds.display();
        ds.addFirst(0);
        ds.display();
        ds.addLast(3);
        ds.display();
        ds.addLast(4);
        ds.display();
        ds.addLast(5);
        ds.display();
        ds.deleteFifrst();
        ds.display();
        ds.addFirst(0);
        ds.display();
        ds.deleteLast();
        ds.display();
    }
}

