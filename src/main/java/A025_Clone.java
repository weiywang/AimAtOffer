package main.java;


//自己的版本在牛客网上始终是返回空，原因未查明，可能是由于本题的特殊性，是复制，所以牛客网检测本题作弊的机制的问题
public class A025_Clone {
    public static RandomListNode Clone(RandomListNode pHead){
        if(pHead == null){
            return null;
        }

        RandomListNode cur = pHead;
        while(cur != null){
            RandomListNode copyNode = new RandomListNode(cur.label);

            RandomListNode nextNode = cur.next;
            cur.next = copyNode;
            copyNode.next = nextNode;
            cur = nextNode;
        }

        cur = pHead;
        RandomListNode copyHead = cur.next;
        RandomListNode copyCur = copyHead;
        while(cur != null && copyCur.next!=null){
            if(cur.random != null){
                copyCur.random = cur.random.next;
            }

            cur = copyCur.next;
            copyCur = cur.next;
        }

        cur = pHead;
        copyCur = cur.next;
        while(cur != null && copyCur.next != null){
            cur.next = copyCur.next;
            cur = cur.next;
            copyCur.next = cur.next;
            copyCur = copyCur.next;
        }

        return copyHead;
    }

    public static void main(String[] Args){
        RandomListNode head = new RandomListNode(0);
        RandomListNode test = head;
        int i = 1;
        while(i++ < 10){
            RandomListNode temp = new RandomListNode(i);
            test.next = temp;
            test = test.next;
        }
        RandomListNode r = head;
        while (r!=null){
            System.out.print(r.label);
            r = r.next;
        }
        System.out.println("/");
        RandomListNode res = Clone(head);
        while (res!=null){
            System.out.print(res.label);
            res = res.next;
        }
    }
}
