class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
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
            return
        temp=self.head
        while(temp.next):
            temp=temp.next
        temp.next=newnode
        
    def listprint(self):
        printval = self.head
        while printval is not None:
            print (printval.data)
            printval = printval.next
        
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None:
            return None
        else:
            temp=self.head
            while temp is not None:
                if temp.data==key:
                    return key
                temp=temp.next
            return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            print("empty linked list")
        else:
            curr=self.head
            prev=self.head
            while curr is not None:
                if curr.data==key:
                    if(prev==curr):
                        self.head=self.head.next
                    else:
                        prev.next=curr.next
                        print('deleted')
                    return
                prev=curr
                curr=curr.next
            print('element not exists')