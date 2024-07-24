/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null ){
            return false;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp  = head;
        while(temp!=null){
            if(!list.contains(temp)){
                list.add(temp);
                temp = temp.next;
            }
            else{
                return true;
            }
        }
        return false;
    }
}