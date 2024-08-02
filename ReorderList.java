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
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
        }
       
        ListNode headSecond = reverseList(slow);
        ListNode headFirst = head;
        while(headFirst!=null && headSecond.next!=null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            ListNode temp1 = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp1;
        }
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