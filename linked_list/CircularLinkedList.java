public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int listSize;

    public class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insertAtBeginning(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            tail = node;
        }
        node.next = head;
        head = node;
        tail.next = node;
        listSize++;
    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        listSize++;
    }

    public void insertAtAnyPosition(int data, int position) {
        Node node = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
        }
        else if(position == listSize-1){
            insertAtLast(data);
        }
        else{
            Node temp = head;
            for(int i = 0; i < position-1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;

        }        listSize++;
    }

    public void deleteFirst(){
        tail.next = head.next;
        head = head.next;
        listSize--;
    }

    public void deleteLast(){
        Node node = head;
        while(node.next != tail) {
            node = node.next;
        }
        node.next = head;
        tail = node;
        listSize--;
    }

    public void deleteAtPosition(int position){
        if(position == 0){
            deleteFirst();
        }

        else if(position == listSize-1){
            deleteLast();
        }
        else{
            Node temp = head;
            for(int i = 0; i < position-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }        listSize--;
    }

    public void display(){
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != head);
    }

    public static void main(String [] args){
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBeginning(4);
        cll.insertAtBeginning(2);
        cll.insertAtLast(6);
        cll.insertAtAnyPosition(0, 0);
        cll.insertAtAnyPosition(8, 4);
        cll.deleteAtPosition(3);
        cll.display();
    }
}
