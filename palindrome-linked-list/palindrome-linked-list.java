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
        if(head == null)
            return true;
        ListNode first = head;
        ListNode last = head;
        int n =1;
        while(last.next!=null){
            last = last.next;
            n++;
        }
        ListNode second=head;
        for(int i=0;i<n/2;i++){
            second = second.next;
        }
        System.out.println(n);
        if(n%2!=0)
            second = second.next;
        //reverse list after n/2 nodes
        second = rev(second);
        
        for(int i=0;i<n/2;i++){
            System.out.println(first.val+" "+second.val);
            if(first.val!=second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }
    
    private ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}