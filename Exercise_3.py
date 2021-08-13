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
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
        else:
            n = self.head
            while n.next is not None:
                n = n.next
            n.next = ListNode(data)
        return newNode.data
                
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            n = self.head
            while n is not None:
                if n.data == key:
                    return True
                n = n.next
        return False
            
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            n = self.head
            if n.data == key:
                return True
            while n.next is not None:
                n = n.next
                if n.next == key:
                    return True
        return False

linkedList = SinglyLinkedList()

while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'append':
        linkedList.append(int(do[1]))
    elif operation == 'find':
        find = linkedList.find(int(do[1]))
        if find is None:
            print('Data not found in Linkedlist.')
        else:
            print('Found data in the Linkedlist.')
    elif operation == 'remove':
        linkedList.remove(int(do[1]))
        print('Removed data fromthe Linkedlist.')
    elif operation == 'quit':
        break
