# Time Complexity : append -> O(n), find -> O(n),remove -> O(n)

# Space Complexity : O(n)

# Did this code successfully run on Leetcode : Did not solve it on leet code, but I tested it on online compiler

# Any problem you faced while coding this : Felt it bit tricky but finally understood and I'm poor at handling edge cases


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data        # store value in node
        self.next = next        # pointer to next node


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None        # initialize head as None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)   # create new node
        
        if self.head is None:       # if list is empty
            self.head = new_node    # make new node as head
            return
        
        temp = self.head            # start from head
        
        while temp.next:            # traverse till last node
            temp = temp.next
        
        temp.next = new_node        # attach new node at end

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head            # start from head
        
        while temp:                 # traverse list
            if temp.data == key:    # check if value matches
                return temp         # return node if found
            temp = temp.next
        
        return None                 # return None if not found

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head            # start from head
        prev = None                 # keep track of previous node
        
        while temp:
            if temp.data == key:    # if value matches
                
                if prev is None:   # if node to delete is head
                    self.head = temp.next  # move head forward
                else:
                    prev.next = temp.next  # bypass current node
                
                return             # exit after deletion
            
            prev = temp            # move prev forward
            temp = temp.next       # move temp forward
