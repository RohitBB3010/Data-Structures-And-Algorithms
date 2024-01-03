public class Main{

    static SingularLinkedList sll = new SingularLinkedList();

    public static void main(String []args){
        sll.insertAtBeginning(2);
        sll.insertAtBeginning(0);
        sll.insertAtEnd(6);
        sll.insertAtPosition(4, 2);
        sll.display();
    }

}