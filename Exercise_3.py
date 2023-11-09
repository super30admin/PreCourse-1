# Time Complexity: O(n)
# append a node: O(n)
# removing a node: O(n)
# searching a node: O(n)
#Space Complexity: O(n)
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next  = None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.length = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # create a new node if there doesn't exist a node
        new_node = ListNode(data)
        # check if the list is empty, if there is no node in the linked list assign the head the new node and tail to the new node as both head and tail point to the new node
        if self.head is None:
            self.head = new_node
            self.tail = new_node
        # if there exists a list/node else condition will make sure that the self.tail points to the new_node which will append new node to the list
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
        return True
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # the below condition checks if the node that we want to get is in a valid range
        if key < 0 or key >= self.length:
            return None
        else:
            temp = self.head
            # since we are using _ is because we are not going to print and value which usually is i, so we use _
            for _ in range(key):
                temp = temp.next
            return temp
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # we can't remove from and invalid index. We return None here is because we're successful we will return a node here and if there is no node we will return None
        if key < 0 or key >= self.length:
            return None
        if key == self.length - 1:
            self.pop()
        prev = self.get(key - 1)
        # creating temp that points to previous.next
        temp = prev.next
        # to pop the next item to temp we use prev.next = temp.next
        prev.next = temp.next
        # to pop the item we use temp.next = None
        temp.next = None
        # we decrement the length since we are popping the element from the linked list
        self.length -= 1
        return temp
