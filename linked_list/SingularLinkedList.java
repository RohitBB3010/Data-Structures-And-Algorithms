public class SingularLinkedList{
    private Node head;
    private Node tail;
    private int listSize;

    public class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }

        public Node(Node next, int data){
            this.data = data;
            this.next = next;
        }
    }

    public void display(){
        Node tempNode = head;

        while(tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
    }

    public void insertAtBeginning(int data){

        Node node = new Node(data);
        node.next = head;
        head = node;

        //incase of empty linked-list
        if(tail == null){
            tail = head;
        }
        listSize++;
    }

    public void insertAtPosition(int data, int position){
        if(position == 0){
            insertAtBeginning(data);
        }
        Node tempNode = head;
        for(int i = 0; i < position - 1; i++){
            tempNode = tempNode.next;
        }
        Node node = new Node(data);
        node.next = tempNode.next;
        tempNode.next = node;
        listSize++;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(tail == null){
            insertAtBeginning(data);
        }

        tail.next = node;
        tail = node;
        listSize++;
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        listSize--;
        return val;
    }

    public int deleteLast(){
        Node tempNode = head;
        while(tempNode.next.next != null){
            tempNode = tempNode.next;
        }
        int val = tempNode.data;
        tempNode.next = null;
        listSize--;
        return val;
    }

    public int deleteAtPosition(int position){
        Node tempNode = head;
        for(int i = 0; i < position-1; i++){
            tempNode = tempNode.next;
        }
        int val = tempNode.data;
        tempNode.next = tempNode.next.next;
        listSize--;
        return val;
    }

    public Node findGivenDataPosition(int findData){
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == findData){
                System.out.println("The data is at position :" +index);
                return temp;
            }
            temp = temp.next;
            index++;
        }
        return temp;
    }

    public Node getNode(int index){
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void deleteByGetMethod(int position){

        //When element is first element
        if(position == 0){
            deleteFirst();
        }
        else if(position == listSize-1){
            deleteLast();
        }
        else{
            Node prevNode = getNode(position);
            prevNode.next = prevNode.next.next;
        }
        listSize--;
    }
}