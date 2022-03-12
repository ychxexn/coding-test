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
    public ListNode mergeNodes(ListNode head) {
        ListNode answer = null;
        ListNode cursor = null;
        
        head = head.next;
        
        while(head != null){
            int sum = 0;
            while(head.val != 0){
                sum += head.val;
                head = head.next;
            }
            if(answer == null){
                answer = new ListNode(sum);
                cursor = answer;
            }else{
                cursor.next = new ListNode(sum);
                cursor = cursor.next;
            }
            head = head.next;
        }
        
        return answer;
    }
}