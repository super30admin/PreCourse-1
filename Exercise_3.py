class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head is None:
            self.head = ListNode(data, None)
        else:
            itr = self.head
            while itr:
                if itr.next is None:
                    itr.next = ListNode(data, None)
                    return
                itr = itr.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return
        itr = self.head
        while itr:
            if itr.data == key:
                return itr.data
            itr = itr.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print('Cannot remove from empty list!')
            return
        if self.head.data == key:
            self.head = self.head.next
            return

        itr = self.head
        prev = ListNode()
        while itr:
            curr = itr
            if itr.data == key:
                prev.next = curr.next
                return
            prev = curr
            itr = itr.next

    def print_sll(self):
        if self.head is None:
            print('Empty Singly Linked List!')
            return

        itr = self.head
        linkedlist = ''
        while itr:
            linkedlist += str(itr.data) + '-->'
            itr = itr.next
        linkedlist += 'None'
        print(linkedlist)


if __name__ == '__main__':
    list_nums = []
    singlyll = SinglyLinkedList()
    singlyll.append(1)
    singlyll.append(2)
    singlyll.append(3)
    singlyll.append(4)
    singlyll.append(5)
    singlyll.find(5)
    singlyll.remove(2)
    singlyll.remove(5)
    singlyll.remove(1)
    singlyll.print_sll()
