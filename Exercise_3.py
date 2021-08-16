  # // Time Complexity : O(n) 
  # // Space Complexity : O(n) where n is the number of nodes added in the linked list
  # // Did this code successfully run on Leetcode : Couldn't find it on leetcode. Any link?
  # // Any problem you faced while coding this : nothing


  # // Your code here along with comments explaining your approach

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
        if self.head:
            cur = self.head
            while cur and cur.next:
                cur = cur.next
            cur.next = node
        else:
            self.head = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        cur = self.head
        while cur:
            # simply checking when the key matches a node val
            if key == cur.data:
                return cur
            cur = cur.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # taking two pointers
        # prev and cur to keep a track of nodes 
        # to precede the node to be deleted
        cur = self.head
        prev = None
        while cur:
            # once the node is found
            # if it is the head node, head if moved to next node
            # else using prev the next pointer is now pointed 
            # to the node next to the current node
            if cur.data == key:
                if prev:
                    prev.next = cur.next
                    cur.next = None
                else:
                    self.head = self.head.next
                return True
            prev = cur
            cur = cur.next
        return False


# testing the code

linked_list = SinglyLinkedList()
linked_list.append(3)
linked_list.append(6)
linked_list.append(5)
linked_list.append(7)
print(linked_list.remove(3))
node = linked_list.find(7)
if node:
    print(node.data)