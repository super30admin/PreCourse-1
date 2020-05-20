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
        self.head = ListNode(0)

    # O(N) time | O(1) Space
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = self.head
        while node.next is not None:
            node = node.next
        node.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head.next
        while node:
            if node.data == key:
                return True
            node = node.next
        return False

    # O(N) time | O(1) Space
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head.next
        prev = self.head
        while node:
            if node.data == key:
                prev.next = node.next
                break
            node = node.next
            prev = prev.next

if __name__ == '__main__':
    sl = SinglyLinkedList()
    sl.append(1)
    sl.append(2)
    sl.append(3)
    res = sl.find(2)
    print(res)
    sl.remove(2)
    print(sl.find(2))