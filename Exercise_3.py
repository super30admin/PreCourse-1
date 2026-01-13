class ListNode:
    #TIME: append: O(n), find: O(n), remove: O(n)
    #SPACE: O(1)
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
        new_node = ListNode(data)
        # If list is empty
        if self.head is None:
            self.head = new_node
            return
        # Traverse to the end of the list
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        current = self.head
        previous = None

        #if head contains the key
        if current and current.data == key:
            self.head = current.next
            return
        #search for the key to be deleted
        while current and current.data != key:
            previous = current
            current = current.next
        #if key was not present in linked list
        if current is None:
            return
        #unlink the node from linked list
        previous.next = current.next
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """



ll = SinglyLinkedList() 
ll.append(10) 
ll.append(20) 
ll.append(30) 
print(ll.find(20).data) # 20 
ll.remove(20) 
print(ll.find(20)) # None