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
        new_node = ListNode(data)
        if not self.head: #if list is empty
            self.head = new_node
            return self.head
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
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None

        #if key is head then remove it
        if current and current.data == key:
            self.head = current.next
            current = None
            return
        
        #Traverse the list
        while current and current.data != key:
            prev = current
            current = current.next

        # If key not found
        if current is None:
            return

        # Unlink the node
        prev.next = current.next
        current = None
    
    def display(self):
        """
        Return all elements of the list as a Python list.
        Takes O(n) time.
        """
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        return elements
    

ll = SinglyLinkedList()
ll.append(10)
ll.append(20)
ll.append(30)
print("List:", ll.display())          # [10, 20, 30]

node = ll.find(20)
print("Found:", node.data if node else None)  # 20

ll.remove(20)
print("After removing 20:", ll.display())     # [10, 30]

ll.remove(100)   # Key not in list
print("After trying to remove 100:", ll.display())  # [10, 30]
        