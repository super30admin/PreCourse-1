#Time complexity: as given in each section
#Space complexity: O(n) as we are only creating a linked list


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None): # initialize linked list
        self.data = None
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

        if self.head == None: # if the linked list is empty we create a new node and thats the head
            self.head = ListNode(data, None)
            return self.head

        newNode = ListNode(data, None) 
        trav = self.head
        while trav.next: # we traverse to the last element and append the new node
            trav = trav.next
        trav.next = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        trav = self.head
        while trav: # we traverse through the list and return when the element is found else none
            if key == trav.data:
                return "element found in the list"
            trav = trav.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head
        if self.head: # if we want to remove the first element then we make the second element head and head as none
            if key == self.head:
                self.head = node.next
                node = None
                return self.head

            while node: # while the linked list is not empty we check if the element is present and increment value of prev and node until we find the element
                if node.data == key:
                    break
                prev = node
                node = node.next
            
            if node == None: # if the node is empty we return
                return 

            prev.next = node.next # if we find the element we point the prev pointer to next node and current node to none
            node = None
            return self.head