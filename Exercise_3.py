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
            self.head = ListNode(data)
            return

        def traverse(head):
            if head.next is None:
                head.next = ListNode(data)
                return head
            else:
                head.next = traverse(head.next)
                return head

        self.head = traverse(self.head)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        def traverse(head):
            if head is None:
                return None
            elif head.data is key:
                return key
            else:
                return traverse(head.next)

        return traverse(self.head)

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        def traverse(head):
            if head is None:
                return head
            elif head.data is key:
                head = head.next
                return head
            else:
                head.next = traverse(head.next)
                return head

        self.head = traverse(self.head)


    def show(self):
        """
        Takes O(n) time
        :return: an array of elements from head to tail
        """
        elements = []

        def traverse(head):
            if head is None:
                return None
            else:
                elements.append(head.data)
                return traverse(head.next)

        traverse(self.head)
        print(elements)


s = SinglyLinkedList()
s.show()
s.append(1)
s.append(2)
s.show()
print(s.find(1))
s.append(3)
print(s.find(11))
s.append(4)
s.show()
s.remove(4)
s.show()
s.remove(43)
s.show()
print(s.find(12))
s.remove(4)
s.show()
s.remove(3)
s.show()
s.remove(2)
s.show()
s.remove(1)
s.show()
