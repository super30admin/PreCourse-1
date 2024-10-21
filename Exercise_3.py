# // Time Complexity :  O(n) mostly since we are iterating in most cases
# // Space Complexity : O(n) because every node references another node
# // Did this code successfully run on Leetcode :NA
# // Any problem you faced while coding this : No
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
        newNode = ListNode(data)
        # check if list is empty for unnexcessary iterations
        if not self.head:
            self.head = newNode
            return
        # find the end of the list and append 
        current = self.head
        while current.next:
            current = current.next
        current.next = newNode
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # find 1st element that matches key
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # check if list is empty
        if not self.head:
            return
        # check if the first element is the key
        if self.head.data == key:
            self.head = self.head.next
            return
        #  check if the key is in the list
        current = self.head
        while current.next:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next

# Testing TSC
sklist = SinglyLinkedList()
sklist.append(1)
sklist.append(2)
sklist.append(3)
sklist.append(4)
sklist.append(5)
print(sklist.head.next.data)
print(sklist.find(3).data)
sklist.remove(2)

def printSLL(self):
    current_node = self.head
    while(current_node):
        print(current_node.data, end = ' -> ')
        if current_node.next == None:
            print('None')
        current_node = current_node.next

printSLL(sklist)