class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None


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
        newnode = ListNode(data)
        if self.head is None:
            self.head = newnode
            return
        last = self.head
        while (last.next):
            last = last.next
        last.next = newnode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head

        while curr is not None:
            if curr.data == key:
                return curr.data
            curr = curr.next

        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        headval = self.head
        if headval is not None:
            if headval.data == key:
                self.head = headval.next
                headval = None
                return
        while headval is not None:
            if headval.data == key:
                break
            prev = headval
            headval = headval.next
        if headval is None:
            return
        prev.next = headval.next
        headval = None


def main():
    """
    To check if code is working or not 
    """
    llist = SinglyLinkedList()
    llist.append(1)
    llist.append(2)
    llist.append(3)
    print(llist.find(1))
    print(llist.find(5))


main()
