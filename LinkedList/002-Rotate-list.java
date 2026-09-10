/*
 * Approach:
 * 1. Traverse the list to find its length and the last node.
 * 2. Reduce k using k % length to avoid unnecessary rotations.
 * 3. Connect the last node to the head to form a circular linked list.
 * 4. Move the tail by (length - k) steps to reach the new tail.
 * 5. Set the next node as the new head and break the circular link.
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode tail=head;
        int l=1;
        while(tail.next!=null){
            l++;
            tail=tail.next;
        }
        k=k%l;

        if(k==0) return head;
        
        tail.next=head;
        int step=l-k;

        for(int i=0;i<step;i++){
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        return head;
    }
}
