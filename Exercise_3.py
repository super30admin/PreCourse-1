# Time Complexity : apend, find, remove O(n), we append in the end of the liked list so O(n), fin also traverse to the whole linked list, remove also whole linked list 
# Space Complexity : O(n) number of elements added in the stack 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I was confused what's the difference between exercise 2 and 3 but looking at append method, inserting at the end, i understood the difference between exercise 2,3

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
        node = ListNode(data)
        if self.head is None:
            self.head = node

        current = self.head

        while current.next:
            current = current.next

        current.next = node # keeping in the end 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None # we have to remove the current node where its data is key, so we need the prev to remove the current node
        while current:
            if current.data == key:
                if prev == None : # if prev is none mean the head data is itself equal to key , so we need to skip the head node
                    self.head = current.next # skipping he current and equating it to the next 
                else :
                    prev.next = current.next # so here lets say prev is at index 5 and current which is equal to current.next which is at index 6 
                    # we are equating the prev.next = current.next means next of prev ( so instead of 5->6 , we are equating 5-> 7) skipping the current node where its dats is key
            prev = current # keeping prev equal to current and current to next , so if current is equal to data then we can skip the prev
            current = current.next
