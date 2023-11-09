"""
Runtime Complexity:
1) Initialization of singly linked list takes O(1)
2) All the other operations such as apppend(), find() and remove() takes O(n) runtime as we traverse the whole list to find a node which matches with the given search key.

Space Complexity:

1)O(n)- as we store or create 'n' nodes
"""

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data        #Assign value/data to the node
        self.next = None        #assign the pointer to next node as null
    
class SinglyLinkedList:
    def __init__(self):
        
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):         
        new_node = ListNode(data)       #create a new node
        if (self.head):                 #if the current list contains elements, we traverse the list and just point the last                                         node to the new node 
            curr = self.head
            while(curr.next):
                curr =curr.next
            curr.next = new_node
        else:                           #if the list is empty, make the new node as the head
            self.head = new_node
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr!=None:                   #if list contains elements, we traverse the list and compare the keys and return                                                the matched node
            if curr.data == key:
                return curr.data
            else:
                return None
        
    def remove(self, key):
        temp = self.head
        if temp is not None:                #if the head of the list contains the matching key, point to the next node of head
            if temp.data == key:
                self.head = temp.next
                temp = None
                return
        while temp is not None:             #if not, we traverse the list. We change the pointers, by assigning the prev                                                    node's next to temp'next and assign temp to None
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        if(temp ==None):
            return
        
        prev.next = temp.next
        temp = None
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
