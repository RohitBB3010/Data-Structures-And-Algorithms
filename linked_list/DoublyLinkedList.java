
public class DoublyLinkedList {
    int listSize;
    Node tail;
    Node head;

    public class Node{
        int data;
        Node previous;
        Node next;

        Node(int data){
            this.data = data;
        }
        public Node(int data, Node previous){
            this.data = data;
            this.previous = previous;
        }
        public Node(int data, Node previous, Node next){
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }

    public void insertAtBeginning(int data){

        //Incase of single element
        if(tail == null){
            tail = head;
        }

        Node node = new Node(data, null, head);
        head = node;
        listSize++;
    }

    public void insertAtEnd(int data){
        if(tail == null){

        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(data, temp, null);
        temp.next = node;
        listSize++;
    }

    public void insertAtAnyPosition(int data, int position){
        if(position == 0){
            insertAtBeginning(data);
        }

        if(position == listSize-1){
            insertAtEnd(data);
        }

        Node temp = head;
        for(int i = 0; i < position-1; i++){
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        node.previous = temp;
        temp.next.previous = node;
        temp.next = node;
        listSize++;
    }

    public void deleteFirst(){
        head.next.previous = null;
        head = head.next;
        listSize--;
    }

    void deleteLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        listSize--;
    }

    public void deleteAtAnyPosition(int position){
        if(position == 0){
            deleteFirst();
        }
        else if(position == listSize-1){
            deleteLast();
        }
        else{
            Node temp = head;
            for(int i = 0; i < position; i++){
                temp = temp.next;
            }

            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            listSize--;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String []args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(5);
        dll.insertAtBeginning(3);
        dll.insertAtBeginning(1);
        dll.insertAtEnd(7);
        dll.insertAtEnd(9);
        dll.insertAtAnyPosition(2, 1);
        dll.deleteAtAnyPosition(5);
        dll.display();
    }
}
