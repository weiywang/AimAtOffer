package main.java;

public class A016_Merge {

    //My Version, It is good.
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode resHead = new ListNode(0);
        ListNode resTemp = resHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                resTemp.next = list1;
                resTemp = resTemp.next;
                list1 = list1.next;
            }else {
                resTemp.next = list2;
                resTemp = resTemp.next;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            resTemp.next = list1;
        }else{
            resTemp.next = list2;
        }

        return resHead.next;
    }
}
