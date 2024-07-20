// "static void main" must be defined in a public class.
//time - O(1), space - O(n)
public class Exercise_3 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    static class LinkedList {
        ListNode head, curr;

        public LinkedList() {
            head = new ListNode(-1);
            curr = null;
            head.next = curr;
        }

        private LinkedList insert(LinkedList list, int val) {
            if(list == null) {
                list = new LinkedList();
                curr = new ListNode(val);
            } else {
                ListNode current = list.head;
                while(current != null && current.next != null) {
                    current = current.next;
                }
                ListNode newNode = new ListNode(val);
                current.next = newNode;
            }
            return list;
        }

        private void printList(LinkedList list) {
            if(list == null) {
                return;
            }
            ListNode current = list.head.next;
            while(current != null) {
                if(current.next == null) {
                    System.out.print(current.val);
                } else {
                    System.out.print(current.val+"->");
                }
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1; i<6; i++) {
            list.insert(list, i);
        }
        list.printList(list);
    }
}