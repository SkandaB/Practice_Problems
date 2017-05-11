/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        return sum_lists(l1,l2);
    }
    
    private static ListNode sum_lists(ListNode list1, ListNode list2) {
        ListNode result_list = new ListNode(0);
        ListNode head = result_list;
        int carry=0, a=0, b=0, sum=0;
        while(list1!=null || list2!=null) {
            if(list1!=null) a = list1.val;
            if(list2!=null) b = list2.val;
            sum = carry + a + b;
            a = b = carry = 0;
            if(sum > 9) {
                carry = sum/10;
                sum = sum%10;
            }
            ListNode curr = new ListNode(sum);
            result_list.next = curr;
            result_list = result_list.next;
            if(list1!=null) list1 = list1.next;
            if(list2!=null) list2 = list2.next;
        }
        if(carry!=0) {
            ListNode carry_node = new ListNode(carry);
            result_list.next = carry_node;
        }
        return head.next;
    }
}
