/**
 * Created by shubham.goyal on 1/20/17.
 */
public class MergeInBetween {

    public static LinkedListNode mergeInBetween(LinkedListNode list1, LinkedListNode list2, int a, int b) {

        if(list1 == null) {
            return list2;
        }
        else if(list2 == null) {
            return list1;
        }

        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;
        LinkedListNode dummy1 = new LinkedListNode(0 , null);
        LinkedListNode dummy2 = new LinkedListNode(0, null);

        dummy1.next = list1;
        dummy2.next = list2;

        LinkedListNode temp1 = dummy1;
        LinkedListNode temp2 = dummy2;

        int i = 0;
        for(i = 1; i < a; i++) {
            temp1 = temp1.next;
        }
        previousNode = temp1;

        for( ; i <= b; i++){
            temp1 = temp1.next;
        }
        nextNode = temp1;

        previousNode.next = list2;
        while(temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = nextNode.next;

        return dummy1.next;
    }
}
