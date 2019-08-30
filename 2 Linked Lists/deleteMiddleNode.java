// delete a node in the middle of a singly linked list
 public static boolean deleteMiddleNode( LinkedListNode middle) {
     if (n == null || n.next == null) {
         return false;
     }
     LinkedListNode next = n.next;
     n.data = next.data;
     n.next = next.next;
     return true;
 }
