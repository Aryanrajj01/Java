class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class Main {
    static void searchFirstOccurrence(Node head, int data)
    {
        Node temp=head;
        boolean matchFound=false;
        int ctr=0;
        while (temp!=null)
        {
            ctr++;
            if(temp.data==data)
            {
                System.out.println("Match found at Node: "+ctr);
                matchFound=true;
                break;
            }
            temp=temp.next;
        }
        if(matchFound==false)
        {
            System.out.println("Match not Found");
        }
    }
    static Node insertBeginning(Node head, int data)
    {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }
        static Node addAtEnd(Node head, int data) {
            Node temp=head;
            Node newNode = new Node(data);

            //Checks if the list is empty
            if (head == null) {
                //If list is empty, both head will point to new node
                head = newNode;
            }
            else {
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            return head;
        }
        static void display(Node linkedList)
        {
            Node temp=linkedList;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
        Node head = null;
        head = insertBeginning(head,18);
        head = insertBeginning(head,12);
        head = insertBeginning(head,7);
        head=addAtEnd(head,45);
        head=addAtEnd(head,77);
        searchFirstOccurrence(head, 20);
        display(head);
    }
}
