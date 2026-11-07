# Time Complexity :
#       append: O(n) - adding a new node at the end of the linked list.
#       find: O(n) - searching for a node with a specific key in the linked list.
#       remove: O(n) - removing a node with a specific key from the linked list.
# Space Complexity : O(N) - N is the number of elements in the linked list, each element is stored as a node in the linked list.

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding : while removing the base case where prev is None is missed. i should check for prev is not None and if its None then self.head = current.next.


# Your code here along with comments explaining your approach

#Trying to push again.


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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

        
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
            current = current.next
        return None

    #Used two pointers approach. We have prev=None and current=self.head. we check if current.data is key if it is key then we already have prev so we just do prev.next to current.next so this way we are removing the current element. if its not matching with key we just move our prev and current pointers.
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None
        while current:
            if current.data == key:
                if prev:
                    prev.next = current.next
                else:
                    self.head = current.next
                return
            prev = current
            current = current.next
