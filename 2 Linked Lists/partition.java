// partition a linked list around a value x, all nodes less than x come before all nodes greater
// than or equal to x
public static LinkedListNode partition(LinkedListNode head, int x) {
    LinkedListNode beforeStart = null;
    LinkedListNode beforeEnd = null;
    LinkedListNode afterStart = null;
    LinkedListNode afterEnd = null;

    while (node != null) {
        if (node.data < x) {
            LinkedListNode next = node.next;
            node.next = null;

            if (beforeStart == null) {
                beforeStart = node;
                beforeEnd = beforeStart;
            } else {
                beforeEnd.next = node;
                beforeEnd = node;
            }
        } else {
            if (afterStart == null) {
                afterStart = node;
                afterEnd = afterStart;
            } else {
                afterEnd.next = node;
                afterEnd = node;
            }
        }
        node = next;
        }

        if (beforeStart == null) {
            return afterStart;
    }
    beforeEnd.next = afterStart;
    return beforeStart;
}
