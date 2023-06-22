class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    #Time Complexity : O(N)
    #Space Complexity : O(N)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data)
        if self.head is None:
            self.head=newNode
        else:  
            n=self.head
            while n.next is not None:
                n=n.next
            n.next=newNode

    #Time Complexity : O(N)
    #Space Complexity : O(N)   
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        n=self.head
        SearchedNode=None
        while n is not None:
            if(key==n.data):
                print("\nFind Results: \ndata:",n.data)
                SearchedNode=n
            n=n.next
        
        if SearchedNode is None:
            print("Key not Found")
                
        
        
    #Time Complexity : O(N)
    #Space Complexity :  O(N)  
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("Empty List")
            return

        if self.head.data==key:
            self.head=self.head.next
            return

        n=self.head
        while n.next :
            if n.next.data==key:
                n.next=n.next.next
                return
            n=n.next

    #Time Complexity : O(N)
    #Space Complexity : O(N)
    def show(self):
        if self.head==None:
            print("List is Empty")
        else: 
            n=self.head
            while n is not None:
                print(n.data)
                n=n.next   
            


SLL=SinglyLinkedList()
SLL.append(10)
SLL.append(20)
SLL.append(30)

print(SLL.show())

SLL.find(30)

SLL.remove(20)

print("\nAfter Removing:")
SLL.show()
