/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class LeetCode_mergeTwoLists {
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        if(headA==null && headB==null) return null;
        if(headA==null) return headB;
        if(headB==null) return headA;
	
	    ListNode start = new ListNode(0);
	    ListNode curr = start;
    
        while(headA!=null && headB!=null) {
            if(headA.val < headB.val) {
                curr.next = headA;
                headA = headA.next;
            } else {
                curr.next = headB;
                headB = headB.next;
        }
        curr = curr.next;
        }
    
        if(headB!=null) curr.next=headB;
        if(headA!=null) curr.next=headA;
	    return start.next;
    }
}
