# Space: O(1)
# Time complexity mentioned in every method
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None):
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
        if self.head == None:
            self.head = newNode
        else:
            n = self.head
            while n and n.next:
                n = n.next
            n.next = newNode
        return newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        n = self.head
        found = None
        while n and n.next:
            if n.data == key:
                found = n
                break
            n = n.next
        return found
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        needle = None
        if self.head == None: # if list empty
            return None
        if self.head.data == key: # if deleting first element
            needle = self.head
            self.head = self.head.next
            needle.next = None
            return needle

        needle = self.head
        while needle:
            if needle.data == key:
                break
            prev = needle
            needle = needle.next
        if needle == None: # key not found
            return None
        else:
            prev.next = needle.next
            needle.next = None
            return needle
    def show(self):
        h = self.head
        while h:
            print(h.data, end='->')
            h=h.next
        print('NULL')


a_stack = SinglyLinkedList()
while True:
    #Give input as string if getting an EOF error. Give input like "a 10" or "r 10"
    print('(a)ppend <value>')
    print('(r)emove <value>')
    print('(s)how')
    print('(q)uit')
    do = input('What would you like to do? ').split()
    operation = do[0].strip().lower()
    if operation == 'a':
        a_stack.append(int(do[1]))
    elif operation == 'r':
        popped = a_stack.remove(int(do[1]))
        if popped is None:
            print('Key not found')
        else:
            print('Popped value: ', popped.data)
    elif operation == 's':
        a_stack.show()
    elif operation == 'q':
        break

