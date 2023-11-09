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
        if self.head==None:
            self.head=ListNode(data)
        else:
            current=self.head
            while current.next is not None:
                current=current.next
            new_node=ListNode(data)
            current.next=new_node
            new_node.next=None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        self.key=key
        scan=self.head
        while scan.data!=key:
            scan=scan.next
        print("found", scan.data)
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        self.key=key
        scan=self.head
        while scan.data!=key:
            current=scan
            scan=scan.next
        current.next=scan.next
        scan=None

    def show(self):
        printval = self.head
        while printval is not None:
            print (printval.data)
            printval = printval.next

a_stack=SinglyLinkedList()

a_stack.append('50')
a_stack.append('60')
a_stack.append('70')
a_stack.append('80')

a_stack.find('70')

a_stack.show()

a_stack.remove('60')
a_stack.show()
