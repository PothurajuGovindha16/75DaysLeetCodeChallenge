/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // find middle node
        ListNode mid=findMiddle(head);
        // reverse second half , we get left and right parts
        ListNode right=reverse(mid.next);
        mid.next=null;
        // traverse left and right and combine nodes 
        ListNode left=head;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;

            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        while(left !=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right !=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
    }
    private ListNode findMiddle(ListNode curr){
        ListNode slow=curr;
        ListNode fast=curr;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}