"""
Time Complexity:
  append(data)    : O(n)
  find(key)       : O(n)
  remove(key)     : O(n)

Space Complexity: O(n), [ n -> number of elements in the list]
"""
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
        node = ListNode(data)
        if self.head is None:
            self.head = node
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return key
            curr = curr.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head

        if curr and curr.data == key:
            self.head = curr.next
            return

        prev = None
        while curr and curr.data != key:
            prev = curr
            curr = curr.next

        if not curr:
            return  # Key not found

        prev.next = curr.next

    def printList(self):
        """
        Print the elements in the list.
        """
        curr = self.head
        result = ""
        while curr:
            result += str(curr.data) + " -> "
            curr = curr.next
        result += "None"
        print(result)

ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.append(5)
ll.printList()
print(ll.find(3))
ll.remove(1)
ll.remove(5)
ll.remove(3)
ll.printList()
