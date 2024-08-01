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
    public boolean isPalindrome(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null){
            slow = slow.next;
        }  
        ListNode secondHead = reverseList(slow);
        while(secondHead!=null){
            if(head.val!=secondHead.val){
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        } 
        return true;
    }
  public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev  = null;
        ListNode present = head;
        ListNode nextNode = head.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            if(nextNode!=null){
                 present = nextNode;
                 nextNode = nextNode.next;
            }else{
                break;
            } 
                
        }
        head = present;
        return head;
    }
}