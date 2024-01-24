# Time Complexity : O(n)
# Space Complexity : O(n)
#  Did this code successfully run on Leetcode : NA
#  Any problem you faced while coding this : NA

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
        tmp = ListNode(data = data, next = None)
        if self.head == None:
            self.head = tmp
            return
        
        tmp_1 = self.head
        tmp_prev = tmp_1

        while tmp_1:
            tmp_prev = tmp_1
            tmp_1 = tmp_1.next

        tmp_prev.next = tmp
        return

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmp = self.head

        while tmp:
            if tmp.data == key:
                break
            tmp = tmp.next 

        return tmp           
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tmp = self.head

        while tmp:
            if tmp.data == key:
                tmp1 = tmp.next
                tmp.data = tmp1.data
                tmp.next = tmp1.next
                break
            tmp = tmp.next

        return
            