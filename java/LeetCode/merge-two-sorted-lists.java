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
        ListNode answer = new ListNode();
        ListNode head = answer;
        
        ListNode newNode = null;
        int num1, num2;
        
        while(list1 != null || list2 != null){
            newNode = new ListNode();
            
            num1 = (list1 != null) ? list1.val : Integer.MAX_VALUE;
            num2 = (list2 != null) ? list2.val : Integer.MAX_VALUE;
                
            if(num1 < num2){
                newNode.val = num1;
                list1 = list1.next;
            }else{
                newNode.val = num2;
                list2 = list2.next;
            }
            
            answer.next = newNode;
            answer = answer.next;
        }
        
        return head.next;
    }
}