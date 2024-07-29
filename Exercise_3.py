# Time Complexity:
# - __init__: O(1)
# - append: O(n) (traversing the list to find the end)
# - find: O(n) (traversing the list to find the element)
# - remove: O(n) (traversing the list to find and remove the element)

# Space Complexity:
# - __init__: O(1) (excluding the space used by the ListNode objects)
# - append: O(1) (excluding the space used by the ListNode objects)
# - find: O(1) (excluding the space used by the ListNode objects)
# - remove: O(1) (excluding the space used by the ListNode objects)
# - The space complexity of the entire program also depends on the number of ListNode objects created, which is proportional to the number of elements in the list.

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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current.data
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None

        while current:
            if current.data == key:
                if previous is None:  # Removing the head node
                    self.head = current.next
                else:
                    previous.next = current.next
                return
            previous = current
            current = current.next