package ICP.Home_Assignment9;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class palindrome_linked_list {
    public static ListNode findMid(ListNode head){
ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
fast=fast.next.next;
slow=slow.next;

        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
           ListNode midVal=findMid(head);
        ListNode prev=null;
        ListNode curr=midVal;
           ListNode next;
           while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           }
           ListNode right=prev;
        ListNode left=head;
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
return true;
    }

}
