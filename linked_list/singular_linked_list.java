
public class LinkedList{
    private node head;
    private node tail;
    private int listSize;

    public SingularLinkedList{
        this.listSize = 0;
    }

    public class Node{
        Node next;
        int data;

        //Constructor to create node when only data is given
        public Node(int data){
            this.data = data;
        }

        //Constructor to create node when both data and next node are given
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        listSize++;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        tail.next = node;
        node.next == null;

        //Incase of no tail
        if(tail == null){
            insertAtBeginning(data);
        }
    }

    public void display(){
        Node tempnode = head;

        while(temp.next !=  null){
            print(tempnode.data + '->');
            tempnode = tempnode.next;
        }
    }
}