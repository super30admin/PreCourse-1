

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
        self.top=None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # traversing to the end of the linked list and appending it.
        if self.head==None:
            self.head=ListNode(data)
        else:
            x=self.head
            while(x.next):
                x=x.next
            x.next=ListNode(data)
        print("inserted sucessfully")


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # traversing through the linked list and check wheather it's equal to key or not.
        if self.head==None:
            print("Stack is Empty")
        else:
            x=self.head
            while(x):
                if x.data==key:
                    print("key ",key," is found")
                    return
            print("Element Not Found")

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            print("Stack is Empty")
        elif self.head.data==key:
            self.head=self.head.next
            print(key," is removed")
        else:
            # traversing through the linked list to find the element to be removed.
            w=self.head
            x=self.head.next
            while(x):
                if x.data==key:
                    w.next=x.next
                    print(key," is removed sucessfully")
                    return
                w=x
                x=x.next
            print(key,' is not in the linked list')

    
    def show(self):
        if self.head==None:
            print("Stack is Empty")
        else:
            x=self.head
            while(x):
                print(x.data)
                x=x.next


sll = SinglyLinkedList()
while True:
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('insert <value>')
    print('remove <value>')
    print('quit')
    print('show')
    do = input('What would you like to do? ').split()
    #Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    operation = do[0].strip().lower()
    if operation == 'insert':
        sll.append(int(do[1]))
    elif operation == 'remove':
        popped = sll.remove(int(do[1]))
    elif operation == "find":
        sll.find(int(do[1]))
    elif operation == 'quit':
        break
    else:
        sll.show()
                    