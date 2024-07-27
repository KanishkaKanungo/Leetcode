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
   
        
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode merge(ListNode temp1,ListNode temp2){
        ListNode dummyNode = new ListNode();
       
        ListNode temp3 = dummyNode;
        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
                temp3.next = temp2;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
            else{
                temp3.next = temp1;
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
        }
        if(temp2!=null){
            temp3.next = temp2;
        }
        if(temp1!=null){
            
            temp3.next = temp1;
            
        }
        return dummyNode.next;
    
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next=null;
        left = sortList(left);
        right = sortList(right);
       
        return merge(left,right);
    }
    
}