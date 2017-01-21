import java.util.HashSet;
import java.util.Set;

/**
 * Created by shubham.goyal on 1/20/17.
 */
public class RedundancyInLinkedList {

    static LinkedListNode optimal(LinkedListNode head) {

        LinkedListNode temp = head;
        LinkedListNode previous = null;

        Set<Integer> integerSet = new HashSet<>();
        while(temp != null) {

            if(integerSet.contains(temp.val)) {
                previous.next = temp.next;
            }
            else {
                previous = temp;
                integerSet.add(temp.val);
            }
            temp = temp.next;
        }

        return head;
    }
}
