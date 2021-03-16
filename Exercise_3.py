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
        self.dummy = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        pointer = self.dummy
        while pointer.next:
            pointer = pointer.next
        pointer.next = ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pointer = self.dummy.next
        while pointer and pointer.data != key:
            pointer = pointer.next        
        return pointer.data if pointer else pointer

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        pointer = self.dummy
        while pointer.next and pointer.next.data != key:
            pointer = pointer.next
        if pointer.next:
            pointer.next = pointer.next.next
        
# Driver code
LL = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'append':
        LL.append(int(do[1]))
    elif operation == 'find':
        found = LL.find(int(do[1]))
        if not found:
            print('Element not found')
        else:
            print('Found element:', found)
    elif operation == 'remove':
        LL.remove(int(do[1]))
    elif operation == 'quit':
        break