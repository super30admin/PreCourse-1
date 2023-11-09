## append() TC: O(n) SC:O(1)
## find() TC: O(n) SC:O(1)
## remove() TC: O(n) SC:O(1)

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None

    # defining getter and setter for data and next
    def getData(self):
        return self.data
    
    def setData(self, data):
        self.data = data
    
    def getNextNode(self):
        return self.next
    
    def setNextNode(self, node):
        self.next = node
    
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
        node = ListNode(data, self.head)
        node.next = self.head
        self.head = node

        return True
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.getData() == key:
                return curr.getData()
            else:
                curr = curr.getNextNode()
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr:
            if curr.getData() == key:
                if prev:
                    prev.setNextNode(curr.getNextNode())
                else:
                    self.head = curr.getNextNode()
                
                return True,curr.getData()
            
            prev = curr
            curr = curr.getNextNode()
        
        return None

sll = SinglyLinkedList()

while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append <value>')
    print('remove <value>')
    print('find <value>')
    print('quit')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()

    if operation == 'append':
        isappend = sll.append(int(do[1]))
        if isappend:
            print(f'The element {do[1]} is appended')
        else:
            print(f'Append failed')


    elif operation == 'remove':
        popped,popped_value = sll.remove(int(do[1]))
        if popped is None:
            print('Linked list is empty.')
        else:
            print(f'Element {popped_value} removed from Linked list')

    elif operation == 'find':
        found = sll.find(int(do[1]))
        if found:
            print(f'Element {do[1]} is found')
        else:
            print(f'Element {do[1]} is not found')

    elif operation == 'quit':
        break