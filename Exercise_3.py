# Time Complexity : O(n) for append, find, remove
# Space Complexity : O(N) where N is the number of elements in the array.
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
        if self.head==None:
            self.head=ListNode(data)
        else:
            temp=self.head
            while temp.next!=None:
             temp = temp.next
            temp.next=ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        if temp.data==key :
            print (temp.data)
            return temp.data
        else:
            temp=temp.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
           print("key not found")
        elif self.head.data==key:
            prev=self.head
            self.head=self.head.next
        else:
            temp=self.head
            while(temp.data!=key):
                prev=temp
                temp=temp.next
            prev.next=temp.next
            temp.next=None
    def disp(self):
            temp=self.head
            while(temp!=None):
                print(int(temp.data))
                temp=temp.next

            
SLL=SinglyLinkedList()
SLL.append(1)
SLL.append(2)
SLL.append(3)
SLL.disp()
SLL.find(2)
SLL.remove(2)
SLL.disp()