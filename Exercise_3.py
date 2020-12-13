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

    def isEmpty(self):
          return True if self.head == None else False

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data, None)
        else:
            i = self.head
            while i.next != None:
                i = i.next
            newnode = ListNode(data, None)
            i.next = newnode
        return
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        i = self.head
        while  i != None and i.data != key:
            i = i.next
        return i
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        i = self.head
        prev = None
        while  i != None and i.data != key:
            prev = i
            i = i.next
        if not i:
            return False
        else:
            if prev == None:
                self.head = i.next
            else:    
                prev.next = i.next
            return True

    def show(self):
        if self.isEmpty():
            return
        else:
            i = self.head
            out = '[TOP] '
            while i != None:
                out = out + str(i.data) + ' -> '
                i = i.next
            return out

a_stack = SinglyLinkedList()
while True:
    print('append <value>')
    print('find <value>')
    print('remove <value>')
    print('show')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'append':
        a_stack.append(int(do[1]))
    elif operation == 'find':
        element = a_stack.find(int(do[1]))
        if element is None:
            print('Key not found.')
        else:
            print('Element: ', element)
    elif operation == 'remove':
        removed = a_stack.remove(int(do[1]))
        if removed:
            print(do[1] + ' was removed from the linked list.')
        else:
            print('Key not found. Nothing was removed.')
    elif operation == 'show':
        curr_stack = a_stack.show()
        if curr_stack is None:
            print('Stack is empty.')
        else:
            print('Current state of stack: ', curr_stack)
    elif operation == 'quit':
        break