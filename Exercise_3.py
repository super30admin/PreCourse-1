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
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp is not None:
            if temp.data == key:
                break
            temp = temp.next
        return temp

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        prev = None
        if self.head is None:
            return "Empty LinkedList"
        elif self.head.data == key:         # If the head contains the key point head to next of head
            self.head = self.head.next
        else:
            while temp is not None:         # If the key is in the body point the previous to next of current node.
                if temp.data == key:
                    prev.next = temp.next
                    # prev = temp
                    # temp.next = None
                    break
                prev = temp
                temp = temp.next


l = SinglyLinkedList()
l.append(10)
l.append(20)
print(l.find(10))
l.remove(10)
print(l.find(20))
l.remove(20)
print(l.find(20))
print(l.remove(20))
