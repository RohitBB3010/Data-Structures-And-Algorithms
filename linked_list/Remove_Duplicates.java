public class Remove_Duplicates {

    SingularLinkedList sll = new SingularLinkedList();

    public SingularLinkedList.Node removeDuplicates(SingularLinkedList.Node head){
        SingularLinkedList.Node temp = head;
        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}
