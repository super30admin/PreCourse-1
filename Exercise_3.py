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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
        else:
            curr = self.head
            while curr.next is not None:
                curr = curr.next
            curr.next = newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head is None:
            return "List is Empty"
        else:
            curr = self.head
            while curr.next is not None:
                if curr.data == key:
                    return curr.data
                curr = curr.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return "List is Empty"
        
        else:
            curr = self.head
            while curr.next is not None:
                if curr.next.data == key:
                    nodetoDelete = curr.next.data
                    curr.next = curr.next.next
                    return nodetoDelete   
                curr = curr.next
            return None



s = SinglyLinkedList()
s.append('1')
s.append('2')
s.append('3')
s.append('4')
s.append('5')

print(s.find('2'))
print(s.remove('3'))
     


