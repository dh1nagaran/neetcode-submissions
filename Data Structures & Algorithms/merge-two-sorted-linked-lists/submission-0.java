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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                if(head==null && tail==null)
                {
                    head=l1;
                    tail=l1;
                }else{
                    tail.next=l1;
                    tail=tail.next;
                }
                l1=l1.next;
            }
            else{
                 if(head==null && tail==null)
                {
                    head=l2;
                    tail=l2;
                }else{
                    tail.next=l2;
                    tail=tail.next;
                }
                l2=l2.next;
            }
        }
        if(l1!=null) tail.next=l1;
        if(l2!=null)tail.next=l2;
        return head;

        
    }
}