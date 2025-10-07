package ICP.Home_Assignment9;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class remove_duplicates_from_sorted_list {
   
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        if(curr==null || curr.next==null){
            return head;
        }
        while(curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }

}
