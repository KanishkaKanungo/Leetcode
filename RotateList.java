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
        if(k<=0 || head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int l = 1;
        while(temp.next!=null){
            temp = temp.next;
            l++;
        }
        temp.next = head;
        if(k<l){
            ListNode temp1 = head;
            ListNode temp2;
            for(int i=1;i<l-k;i++){
            temp1 = temp1.next;
            }
            temp2 = temp1.next;
            temp1.next = null;
            head = temp2;
        }else{
            int skip = l-(k%l);
            ListNode temp1 = head;
            ListNode temp2;
            for(int i=1;i<skip;i++){
            temp1 = temp1.next;
            }
            temp2 = temp1.next;
            temp1.next = null;
            head = temp2;
        }
        return head;
    }
    
}