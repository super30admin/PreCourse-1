#Implement Singly Linked List.
'''
Append and remove operation
Time complexity : O(n)
Space Complexity: O(1)

Implement Singly Linked List.

Did this code successfully run on Leetcode : did not find on leetcode
Any problem you faced while coding this : there was no driver code. so I added that part
Your code here along with comments explaining your approach'''

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None):
        self.data = data
        self.next = None
        
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
        '''Initialize new node'''
        new_node = ListNode(data)

        if self.head is None:
            self.head = new_node
            return
        last_node = self.head 
        while last_node.next: # find the end of the list
            last_node = last_node.next
        last_node.next = new_node  

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Initialize current node to head
        cur_node = self.head

        while cur_node:
            if cur_node.data == key:
                return cur_node.data # data found

            cur_node = cur_node.next 
        return None # data not found

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        cur_node = self.head
        while cur_node and cur_node.data==key: # if current node is key
            self.head = cur_node.next 
            cur_node = None
            return

        prev = None
        while cur_node and cur_node.data != key: # if current node is not key
            prev = cur_node
            cur_node = cur_node.next 
        
        if cur_node is None:
            return 
  
        prev.next = cur_node.next
        cur_node = None


    def print_list(self):
        cur_node = self.head
        while cur_node:
            print(cur_node.data)
            cur_node = cur_node.next

#Driver code
llist = SinglyLinkedList()
llist.append(1)
llist.append(2)
llist.append(3)
llist.remove(3)
#print(llist.find(3))
llist.print_list()
