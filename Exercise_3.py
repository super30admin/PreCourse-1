class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None
    
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
        newnode=ListNode(data)
        if self.head==None:
            self.head=newnode
        else:
            current=self.head
            while(current.next):
                current=current.next
            current.next=newnode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while(current.next):
            
            if current.data==int(key):
                
                return key
            current=current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        current=temp.next
        while(temp.next):
            if current.data==int(key):
                
                temp.next=current.next
                current.next=None
                current=temp.next
                return
            current=current.next
            temp=temp.next
    def print(self):
        current=self.head
        while(current.next):
            print(current.data)
            current=current.next
        print(current.data)



ll=SinglyLinkedList()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('append<value>')
    print('find<value>')
    print('remove<value>')
    print('display')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'append':
        ll.append(int(do[1]))
    elif operation == 'find':
        val = ll.find(do[1])
        if val is None:
            print('key not found')
        else:
            print(val,"found")
    elif operation == 'remove':
        ll.remove(do[1])
    elif operation == 'print':
        ll.print()


