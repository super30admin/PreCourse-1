##Exercise_3 : Implement Singly Linked List.
# Time Complexity : O(1) for append, O(n) for find, remove.
# Space Complexity : O(n) where n is length of linked list.
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

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
        self.prev = None
        self.temp = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(1) time.
        """
        # when list is empty
        # head point to first node
        # temp point to first node
        if self.head is None:
            n = ListNode(data)
            self.head = n
            self.temp = self.head

        # create new node and append it
        # temp always to last node in list
        else:
            n = ListNode(data)
            self.temp.next = n
            self.temp = self.temp.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #start finding from first node
        self.findK = self.head

        # check non empty list
        # iterate to the last node in list
        if self.head is not None:
            while(self.findK.next is not None):    
                if self.findK.data == key:
                    #findK holds the foundKeyNode
                    return self.findK        
                # prev point to a node before findK
                self.prev = self.findK
                self.findK = self.findK.next

        # return None if not found
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.find(key) is not None:
            foundKeyNode = self.find(key)
            # if first node removed, prev point to next node after foundKeyNode
            if foundKeyNode == self.head:
                self.head = foundKeyNode.next

            # if middle node or last node removed, prev point to next node after foundKeyNode
            else:
                self.prev.next = foundKeyNode.next