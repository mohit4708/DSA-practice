/* We create a class for a node in link list because LL's are non-primitive data types (Object types) & since node is an
* Object we need to create a class Node which contains the data and pointer to the next node*/
class  Node{
    int data;
    Node next;

    Node(int new_data){
        data=new_data;
        next=null;
    }
}

public class LinkList {
    /* Creating a Singly Linked List */

    /*Inserting an element in a linked List at first position */
    public Node InsertAtFirst(Node head,int data){
        Node new_node = new Node(data);

        new_node.next = head;

        return new_node;
    }

    public void InsertAtGivenPosition(Node head , int data , int key){
        Node cur = head;
        Node new_node = new Node(data);
        while(cur!=null){
            if(cur.data == key){
                new_node.next = cur.next;
                cur.next = new_node ;
                break;
            }
            cur = cur.next;
        }
//        return head;
    }

    /* Removing the first node of the list */
    public Node RemoveAtFirst(Node head){
        Node cur = head;
        head=head.next;
        cur.next = null;

        return head;

    }

    /* Function to remove a node at a given position */
    public Node RemoveAtGivenPosition(Node head, int pos){

        Node temp = head;
        Node prev = null;

        // Base case if linked list is empty
        if (temp == null)
            return head;

        // Case 1: Head is to be deleted
        if (pos == 1) {
            head = temp.next;
            return head;
        }

        // Case 2: Node to be deleted is in middle
        // Traverse till given position
        for (int i = 1; temp != null && i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }

        // If given position is found, delete node
        if (temp != null) {
            prev.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }

        return head;
    }
    /*While Printing a linked list you can just pass the head Node as reference */
    /* to print the list iterate over it using a variable cur(node type) */
    public void printList(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
    public static void main(String[] args){
       Node head = new Node(4); /* whenever initializing the first node mark it as the head */
       head.next = new Node(5);
       head.next.next = new Node(6);
       head.next.next.next = new Node(7);

       LinkList ll= new LinkList();

       head = ll.InsertAtFirst(head , 1);
       head = ll.InsertAtFirst(head , 6);
//       head = ll.RemoveAtFirst(head);
       head = ll.RemoveAtFirst(head);
       head = ll.RemoveAtFirst(head);

       /* Inserting a new node */
//        int key = 5, data = 9;
//       head = ll.InsertAtGivenPosition(head,data,key);


       ll.InsertAtGivenPosition(head,11,6);
       ll.InsertAtGivenPosition(head,12,11);

       head = ll.RemoveAtGivenPosition(head,3);
       head = ll.RemoveAtGivenPosition(head,3);
       ll.printList(head);
    }
}
