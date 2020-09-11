class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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

        if self.head is None:
            self.head=ListNode(data)
        else:
            curr_node=self.head
            while curr_node.next:
                curr_node=curr_node.next
            curr_node.next=ListNode(data)
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head is None:
            print("List is empty")
            return None
        curr_node = self.head
        while curr_node:
            if curr_node.data==key:
                return curr_node.data
            curr_node=curr_node.next
        return None        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            print("Linked list is empty")
            return
        curr_node=self.head
        if curr_node.data==key:
            self.head=curr_node.next
            return
        prev=None 
        while curr_node:
            if curr_node.data==key:
                prev.next=curr_node.next
            prev=curr_node
            curr_node=curr_node.next

    def print_list(self):
        curr_node=self.head
        while curr_node:
            print(curr_node.data)
            curr_node=curr_node.next
            
s=SinglyLinkedList()
s.append(4)
s.append(7)
s.remove(4)
print(s.find(7))
s.print_list()