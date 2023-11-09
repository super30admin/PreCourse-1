#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode :
#Any problem you faced while coding this :

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
        else:
            current_node = self.head
            while current_node.next:
                current_node = current_node.next
            current_node.next = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while current_node:
            if current_node.data == key:
                return current_node.data
            current_node = current_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if key == self.head.data:   #if we want to remove first element
            self.head = self.head.next
        
        else:
            prev = None
            curr = self.head
            while curr:
                if curr.data == key:
                    prev.next = curr.next
                    return 
                prev = curr
                curr = curr.next
                
    def print_linked_list(self):
        """
        Prints Linkedlist in O(n) time
        """
        current = self.head
        while current:
            print(current.data, end = " ")
            current = current.next
        print()
        
                
                
linked_list = SinglyLinkedList()
linked_list.append(10)
linked_list.append(20)
linked_list.append(30)
linked_list.print_linked_list()
linked_list.remove(10)
linked_list.print_linked_list()
linked_list.remove(30)
linked_list.print_linked_list()