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
                return current   #return element
            current = current.next
        return None #key not found
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        if current and current.data == key:    #key is present in head of the linked list
            self.head = current.next
            return
        prev = None
        while current and current.data != key:
            prev = current
            current = current.next
        #key is not found
        if current is None:
            return
        #Remove the node
        prev.next = current.next

linkedList = SinglyLinkedList()
linkedList.append(10)
linkedList.append(20)
linkedList.append(30)
linkedList.append(20)

linkedList.remove(20) #removes the first occurred 20 => [10,30,20]
print(linkedList.find(20))
print(linkedList.find(40))


