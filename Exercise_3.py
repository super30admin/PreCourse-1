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
        else:
            current_node = self.head
            while current_node.next is not None:
                current_node = current_node.next
            current_node.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node is not None:
            if current_node.data == key:
                return current_node.data
            current_node = current_node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous_node = None
        current_node = self.head
        while current_node is not None:
            if current_node.data == key:
                if previous_node is None:
                    self.head = current_node.next
                else:
                    previous_node.next = current_node.next
                return
            previous_node = current_node
            current_node = current_node.next
a_linkedlist = SinglyLinkedList()            
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'append':
        a_linkedlist.append(int(do[1]))
    elif operation == 'find':
        found = a_linkedlist.find(int(do[1]))
        if found is None:
            print('element not found')
        else:
            print('found value: ', int(found))
    elif operation == 'remove':
        removed = a_linkedlist.remove(int(do[1]))
       
    elif operation == 'quit':
        break    