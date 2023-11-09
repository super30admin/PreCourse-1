#Time Complexity:O(1)
#Space Complexity:O(1)
#Did this code successfully run on Leetcode : Question not avaliable in Leetcode
#Any problem you faced while coding this : None
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):  #time---O(1) space--O(1)
        self.data=data
        self.next=next
        
    
class SinglyLinkedList:
    def __init__(self):                        #time---O(1) space--O(1)
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head=None

    def append(self, data):                   #time---O(n) space--O(1)
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        curr=self.head
        newNode=ListNode(data)
        if self.head:
            while curr.next:
                curr=curr.next
            curr.next=newNode
        else:
            self.head=newNode

    def find(self, key):                     #time---O(n) space--O(1)
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """ 
        prev=None
        curr=self.head
        if curr:
            while(curr.next and curr.data!=key):
                prev=curr
                curr=curr.next
            if curr.data==key:
                return prev
            else:
                return None
        else:
            print("List is Empty")
    def remove(self, key):                    #time---O(n) space--O(1)
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev=linkedList.find(key)
        if prev:
            if prev.next.next:
                prev.next=prev.next.next
            else:
                prev.next=None
            print("Element Removed")
        elif self.head.data==key:
            self.head=self.head.next
        else:
            print("ELement not present")
    
linkedList=SinglyLinkedList()
