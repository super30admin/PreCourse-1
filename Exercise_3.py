"""
Time Complexity:

Space Complexity:
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

    def append(self, node: ListNode):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """

        # If linkedlist is empty, the new node just becomes the head
        if self.head is None:
            self.head = node
            return

        temp = self.head

        # move to the last Node
        while temp.next:
            temp = temp.next

        temp.next = node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        # If linkedlist is empty
        if self.head is None:
            return None

        temp = self.head

        while temp.data != key:
            temp = temp.next

            if temp is None:
                return None

        return temp
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        # If linkedlist is empty, there is nothing to remove
        if self.head is None:
            return

        # Special case: the key is in the head node itself
        if self.head.data == key:
            self.head = self.head.next
            return

        prev = self.head
        temp = self.head.next

        # Traverse until key is found, moving prev and temp together
        while temp is not None and temp.data != key:
            prev = temp
            temp = temp.next

        # Key was not found anywhere in the list
        if temp is None:
            return

        # Unlink temp by pointing prev past it
        prev.next = temp.next
        temp.next = None

    def display(self):
        """
        Print the contents of the list from head to tail.
        Takes O(n) time.
        """
        current = self.head
        values = []

        while current is not None:
            values.append(str(current.data))
            current = current.next

        print(" -> ".join(values))


def main():
    n1 = ListNode(10)
    l = SinglyLinkedList()
    l.head = n1    

    n2 = ListNode(20)
    n1.next = n2

    n3 = ListNode(30)
    n2.next = n3

    n4 = ListNode(40)
    l.append(n4)
    l.remove(30)

    l.display()

if __name__ == "__main__":
    main()
