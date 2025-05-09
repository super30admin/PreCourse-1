#Time Complexity:
#append: O(n)
#find: O(n)
#remove: O(n)
#Space Complexity: O(n)
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
                if previous:
                    previous.next = current.next
                else:
                    # Removing head
                    self.head = current.next
                return  # Exit after removing
            previous = current
            current = current.next

  
ll = SinglyLinkedList()

ll.append(10)
ll.append(20)
ll.append(30)

print(ll.find(20))
print(ll.remove(30))

