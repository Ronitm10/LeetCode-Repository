/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a != b)
        {
            a = a==null ? headB : a.next;
            b = b==null ? headA : b.next;
        }
        
        return a;
        
        
        // headA = Reverse(headA);
        // headB = Reverse(headB);
        // while(headA != null && headB != null)
        // {
        //     if(headA.val != headB.val && headA.next.val != headB.next.val)
        //     {
        //         return headA;
        //     }
        //     headA = headA.next;
        //     headB = headB.next;
        // }
        // return null;
    }
    
    // public ListNode Reverse(ListNode head)
    // {
    //     ListNode d = new ListNode(0); 
    //     ListNode temp = head;
    //     while(head != null)
    //     {
    //         temp = head.next;
    //         head.next = d;
    //         d = head;
    //         head = temp;
    //     }
    //     return d;
    // }
    
    
}