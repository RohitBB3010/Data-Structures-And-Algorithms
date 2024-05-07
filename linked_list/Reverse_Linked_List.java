public class Reverse_Linked_List {
    public SingularLinkedList.Node reverseList(SingularLinkedList.Node head){
        SingularLinkedList.Node tempStart = head;
        SingularLinkedList.Node tempEnd = head;
        int data;

        if(head == null){
            return head;
        }
        while(tempStart.next == tempEnd){
            data = tempStart.data;
            tempStart.data = tempEnd.data;
            tempEnd.data = data;

            tempStart = tempStart.next;
            tempEnd = tempEnd.next;
        }
        return head;
    }
}
