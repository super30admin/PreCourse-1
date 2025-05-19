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

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data) #creates a new node
        if self.head is None:
            self.head=new_node #new node becomes head if the list is empty
            return
        current = self.head
        while current.next:
         current=current.next #traverses until next is None
        current.next=new_node #links the last node to new node 

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current=self.head
        while current:
            if current.data==key: #checks each nodes data 
                return current  
            current=current.next 
            return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current=self.head
        prev=None 
        while current:
            if current.data==key:
                if prev is None:
                    self.head=current.next
                else:
                    prev.next=current.next
                    return
                prev=current
                current=current.next
                print(f"key'{key}'not found in the list")
    
    def display(self):
        if self.head is None:
            print("List is empty")
            return
        current=self.head
        print("Singly Linked List:",end=" ")
        while current:
            print(f"[{current.data}]",end=" -> ")
            current=current.next
            print("None")

ll=SinglyLinkedList()
ll.append(10)
ll.append(20)
ll.append(30)
ll.display()

node=ll.find(20)
print("Node Found:",node.data if node else "Not Found")

ll.remove(20)
ll.display()

ll.remove(100)
