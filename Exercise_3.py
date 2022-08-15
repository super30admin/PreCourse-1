#!/Library/Frameworks/Python.framework/Versions/3.10/bin/python3

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        data=data
        next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        size=0
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode=ListNode(data)
        if(self.size==0):
            head= newNode
            size=size+1
            return
        else:
            temp=self.head
            while(temp.next!=None):
                temp=temp.next
            temp.next=newNode
            size=size+1
            return
    
    def find(self, key):
        temp=self.head
        while(temp.next!=None):
            if(temp.data==key):
                return key
            temp=temp.next
        return None

    def remove(self, key):
        temp=self.head
        found=0
        prev=temp
        while(temp.next!=None):
            if(temp.data==key):
                found=1
                break
            prev=temp
            temp=temp.next
        
        if(found==1):
            prev.next=prev.next.next
            size=size-1
