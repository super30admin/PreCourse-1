# Time Complexity : O(n)
# Space Complexity : O(n) where n is the size of the linked list
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next=None):
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
        if(self.head==None):
            self.head=ListNode(data,None)
        else:
            node=self.head
            while(node.next!=None):
                node=node.next
            new_node=ListNode(data,None)
            node.next=new_node
            
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node=self.head
        while(node!=None):
            if(node.data==key):
                return key
            node=node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node=self.head
        while(node!=None):
            if(node.next.data==key):
                node.next=node.next.next
                return
            node=node.next
        return
    
#Next few lines are to check if its working properly
#     def print(self):
#         node=self.head
#         while(node!=None):
#             print(node.data)
#             node=node.next

# x=SinglyLinkedList()
# x.append(1)
# x.append(2)
# x.append(3)
# x.append(4)
# x.append(5)
# x.remove(3)
# x.print()
