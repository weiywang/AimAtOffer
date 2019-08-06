package main.java;

public class A015_ReverseList {


    //My Version, Wrong, 自己没独立找到错误
//    public ListNode ReverseList(ListNode head) {
//        ListNode reverseListHead = null;
//        ListNode nowNode = head;
//        ListNode prevNode = head;//prevNode应该等于null,仔细琢磨琢磨,就错在这
                                   //prevNode设为Head，会导致新链形成环，下面的循环就成了死循环
//
//        while(nowNode != null){//逻辑可以合并，精简，这就叫冗余代码
//            ListNode nextNode = nowNode.next;
//            if(nextNode != null){
//                nowNode.next = prevNode;
//                prevNode = nowNode;
//                nowNode = nextNode;
//            }else {
//                reverseListHead = nowNode;
//                nowNode.next = prevNode;
//                prevNode = nowNode;
//                nowNode = nextNode;
//            }
//        }
//        return reverseListHead;
//    }


    //Standard Version
    public ListNode ReverseList(ListNode head) {
        ListNode reverseHeadNode = null;
        ListNode nowNode = head;
        ListNode prevNode = null;
        while(nowNode != null){
            ListNode nextNode = nowNode.next;
            if(nextNode == null){
                reverseHeadNode = nowNode;
            }
            nowNode.next = prevNode;
            prevNode = nowNode;
            nowNode = nextNode;
        }
        return reverseHeadNode;
    }
}
