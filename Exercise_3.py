# time complexity : O(N) for append, find nad remove operation
# space complexity: O(N) for all operations

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
    

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
        newNode = ListNode(data)
        node = self.head
        if self.head is None:
            self.head = newNode
        else:
            while node.next is not None:
                node = node.next
            node.next = newNode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        if self.head is None:
            return None
        else:
            while node:
                if node.data == key:
                    return node
                node = node.next
            return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        if self.head is None:
            return
        else:
            while curr:
                if curr.data == key:
                    if prev is None:
                        self.head = curr.next
                    else:
                        prev.next = curr.next
                    return
                prev = curr
                curr = curr.next

                


