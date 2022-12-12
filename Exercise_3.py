# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NO

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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node=ListNode(data)
        if(self.head.data is None):
            self.head.data=data
        else:
            iterr=self.head
            while(iterr.next is not None):
                iterr=iterr.next
            iterr.next=new_node



        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        iterr=self.head
        while(iterr is not None and iterr.data!=key):
            iterr=iterr.next
        if(iterr is not None):
            return(iterr)
        else:
            return(None)
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head.data==key):
            self.head=self.head.next
            return
        iterr=self.head
        while(iterr.next!=None and iterr.next.data!=key ):
            iterr=iterr.next
        if(iterr.next==None):
            return("Item Not Found")
        iterr.next=iterr.next.next
    
    def PrintList(self):
        iterr=self.head
        while(iterr!=None):
            print(iterr.data)
            iterr=iterr.next


test_List = SinglyLinkedList()
test_List.append(10)
test_List.append(20)
test_List.append(30)

test_List.remove(20)
print(test_List.find(30))


test_List.PrintList()


