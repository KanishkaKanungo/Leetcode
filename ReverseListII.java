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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if(left==right){
        return head;
      }
      ListNode present = head;
      ListNode prev =null;
     for(int i=1;present!=null && i<=left-1;i++){
        prev = present;
        present = present.next;
     }
     ListNode current = present;
     ListNode newLast = prev;
     ListNode nextNode = present.next;
     for(int i=1;present!=null && i<=right-left+1;i++){
        present.next = prev;
        prev = present;
        present = nextNode;
        if(nextNode!=null){
            nextNode = nextNode.next;
        }
     }
     if(newLast!=null){
        newLast.next = prev;
     }else{
        head = prev;
     }
     current.next  = present;
     return head;
    }
}