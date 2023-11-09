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
        # node = ListNode(data)
        if self.head is None:
            self.head = ListNode(data)
            return

        temp = self.head
        while temp.next!=None:
            temp = temp.next

        temp.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        temp = self.head
        while temp != None:
            if temp.data == key:
                return key
            else:
                temp = temp.next

        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None or (self.head.data==key and self.head.next == None):
            self.head = None
            return

        temp = self.head
        while temp.next != None:
            if temp.next.data == key:
                temp.next = temp.next.next
            else:
                temp = temp.next


    def show(self):
        """
        Takes O(n) time
        :return: an array of elements from head to tail
        """
        elements = []
        temp = self.head
        while temp != None:
            elements.append(temp.data)
            temp = temp.next

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
