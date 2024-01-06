public class Linked_List_Cycle{
    public Boolean hasCycle(SingularLinkedList.Node head){
        if(head == null){
            return false;

        }
        SingularLinkedList.Node temp = head;

        while(temp != null){
            temp.data = 11011;
            if(temp.next.data == 11011){
                return true;
            }
            else{
                temp = temp.next;

            }
        }
        return false;
    }
}