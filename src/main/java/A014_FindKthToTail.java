package main.java;

public class A014_FindKthToTail {

    //自己的版本，最后的结果是试出来的
//    public ListNode FindKthToTail(ListNode head, int k) {
//        if(head == null){
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        for(int i = 0; i < k; i++){
//            if(fast == null){//为何不是fast.next，要自己揣摩，积累经验
//                return null;
//            }
//            fast = fast.next;
//        }
//
//        while(fast != null){//为何不是fast.next，要自己揣摩，积累经验
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }


    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode cursor = head;
        ListNode cursorK = head;

        int i = 0;

        while (cursorK != null) {
            cursorK = cursorK.next;

            if (i >= k) {
                cursor = cursor.next;
            }

            i++;
        }

        if (i < k) {
            return null;
        }

        return cursor;
    }
}
