/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Rm_dup_sortd_list {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        
        ListNode prev,curr;
        prev = new ListNode(0);
        
        prev.next = head;
        curr = prev.next;
        
        while(curr!=null && curr.next!=null) {
            if(prev.next.val != curr.next.val) {
                prev = prev.next;
                curr = curr.next;
                continue;
            } else {
                while(curr.next != null && prev.next.val == curr.next.val)
                    curr = curr.next;
            }
            if(prev.next == head) head = curr.next;
            prev.next = curr.next;
            curr = prev.next;
        }
        return head;
    }
}
