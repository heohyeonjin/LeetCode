import java.util.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
        ListNode answer = null;
        int carry = 0;
        ListNode cur = new ListNode();
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            int decimal = sum/10; // 십의 자리 수
            int one = sum%10; // 일의 자리 수
            carry = decimal;

            if(answer==null){ // 초기화
                answer = new ListNode(one);
                cur = answer;
            }
            else{
               cur.next = new ListNode(one);
               cur = cur.next;
            }
           
            l1 = l1.next;
            l2 = l2.next; 
        }

        // 남은 리스트
        while(l1!=null){
            int sum = l1.val+carry;
            int decimal = sum/10;
            int one = sum%10;
            carry = decimal;

            cur.next = new ListNode(one);
            cur = cur.next;

            l1 = l1.next;
        } 

        while(l2!=null){
            int sum = l2.val+carry;
            int decimal = sum/10;
            int one = sum%10;
            carry = decimal;
                
            cur.next = new ListNode(one);
            cur = cur.next;

            l2 = l2.next;
        }
        
        // carry가 남아있는 경우
        if(carry>0){
            cur.next = new ListNode(carry);
        }

        return answer;
    }
}