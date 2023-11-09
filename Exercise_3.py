# Time Complexity : O(n) for all operation 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : 
# Any problem you faced while coding this :
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next
    
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
        if self.head == None :
            self.head = ListNode(data)
        else:
            ptr = self.head
            nxtnode = ListNode(data)
            while ptr.next != None:
                ptr = ptr.next
            ptr.next = nxtnode
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None :
            return None
        else:
            ptr = self.head
            while ptr != None:
                if ptr.data == key:
                    return ptr.data
                else:
                    ptr = ptr.next
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None :
            return None
        else:
            ptr = self.head
            if ptr.data == key:
                self.head = self.head.next
                ptr.next = None
                return True
            else:
                while ptr.next != None:
                    if ptr.next.data == key :
                        tempnode = ptr.next
                        ptr.next = ptr.next.next
                        tempnode.next = None
                        return True
                    else:
                        ptr = ptr.next
            return False
