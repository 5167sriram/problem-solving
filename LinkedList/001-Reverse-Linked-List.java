
/*
 * Approach:
 * Reverse the links using three pointers: temp, prv, and n.
 * Store the next node, reverse the current link, then move the pointers.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        else{
            ListNode temp=head;
            ListNode prv=null;
            while(temp!=null){
                ListNode n=temp.next;
                temp.next=prv;
                prv=temp;
                temp=n;
            }
            return prv;
        }
        
    }
}
