class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    def __str__(self):
        return str(self.data)
    
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
            itr=self.head
            while itr.next!=None:
                itr=itr.next
            itr.next=ListNode(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head==None:
            return None
        
        itr=self.head
        while itr!=None :
            if itr.data==key:
                return itr
            itr=itr.next
        return None
        



    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head==None:
            return None


        itr=self.head

        if itr.data==key:
            self.head=itr.next
            return itr
        
        while  itr!=None :
            if itr.data==key:
                break
            prev=itr
            itr=itr.next 
        
        if itr==None:
            return None
        
        prev.next=itr.next
        
        return itr


        return None

    def __str__(self):
        if self.head!=None:
            itr=self.head
            while itr!=None:
                print(itr.data)
                itr=itr.next
            
        return ""
        
        
A=SinglyLinkedList()
A.append(2)
A.append(4)
A.append(6)
A.append(7)

print("find 7 :: ",A.find(7))

print(A)

A.remove(4)
print("After removing 4 ::  \n",A)
A.remove(2)
print("After removing 2 :: \n ",A)

A.remove(7)
print("After removing 7 :: \n ",A)


