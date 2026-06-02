# Time and Space Complexity
# Overall Space Complexity is O(N) where N is total number of elements in the list
# append function takes O(N) time complexity and O(1) space complexity
# find function takes O(N) time complexity and O(1) space complexity
# remove function takes O(N) time complexity and O(1) space complexity

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
        newNode=ListNode(data)
        if self.head==None:
            self.head=newNode
        else:
            a=self.head
            while a.next!=None:
                a=a.next
            a.next=newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        a=self.head
        while a!=None:
            if a.data==key:
                return a 
            a=a.next 
        return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        a=self.head
        if self.head==None:
            return None 
        if self.head.data==key:
            self.head=self.head.next 
            return None 
        while a.next!=None:
            if a.next.data==key:
                a.next=a.next.next
                return None 
            a=a.next 

ll = SinglyLinkedList()

ll.append(10)
ll.append(20)
ll.append(30)
found = ll.find(20)
print(found.data)
ll.remove(20)