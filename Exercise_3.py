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
        if not self.head:
            self.head = ListNode(data)
            self.head.next = None
        else:
            newNode = ListNode(data)
            self.head.next = newNode 
            self.head = newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # use a new pointer to traverse through and stop at target node if exists else it is None at the end  
        temp = self.head
        found = False
        while temp and not found:
            if temp.data == key:
                found = True
            else:
                temp = temp.next
        if not temp:
            return None
        return temp

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # Basic linkedlist element delete operation: We find predecessor node to the target and make it's next to point to the node next to the target- disassociating the target node from list
        # Using a sentinel node as a pseudo node to handle cases where in we find the head to be the node to be deleted
        sentinel = ListNode(0)
        sentinel.next = self.head
        prev, temp = sentinel, self.head
        # traverse list until end or target found
        found = False
        while temp and not found:
            if temp.data == key:
                prev.next = temp.next # we bypass temp node 
                found = True
            else:
                prev = temp
                temp = temp.next
        return sentinel.next