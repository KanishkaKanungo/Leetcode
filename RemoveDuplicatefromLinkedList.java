Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp = head;
        int index = 0;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        
        return head; 
    }
    
}