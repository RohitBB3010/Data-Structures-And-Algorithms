import javax.swing.*;

public class Merge_Two_Sorted_Lists {
    public SingularLinkedList.Node mergeTwoLists(SingularLinkedList.Node head1, SingularLinkedList.Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head2;
        }

        SingularLinkedList.Node temp1 = head1;
        SingularLinkedList.Node temp2 = head2;
        SingularLinkedList.Node headMain;
        SingularLinkedList.Node tempMain;

        if(head1.data > head2.data){
            headMain = head2;
            temp2 = temp2.next;
            tempMain = headMain;
        } else{
            headMain = head1;
            temp1 = temp1.next;
            tempMain = headMain;
        }

        while(temp1.next != null && temp2.next != null){
            if(temp1.data > temp2.data){
                tempMain.next = temp2;
            }
            else if(temp2.data > temp1.data){
                tempMain.next = temp1;

            }
            else if(temp1.next == null){
                while(temp2.next != null){
                    headMain.next = temp2.next;
                }
            }
            else{
                while(temp1.next != null){
                    headMain.next = temp1.next;

                }
            }
        }
        return headMain;
    }
}
