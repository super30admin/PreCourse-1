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
        node=ListNode(data)
        if self.head is None:
            self.head=node
            return 
        curr=self.head
        while curr.next:
            curr=curr.next
        curr.next=node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr=self.head
        while curr:
            if curr.data==key:
                return curr
            curr=curr.next
        return 0
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr=self.head
        if curr.data==key:
            self.head=curr.next
            return
        prev=None
        while curr and curr.data!=key:
            prev=curr
            curr=curr.next
        prev.next=curr.next

    def print_list(self):
        """
        Traverses the linked list and prints the elements.
        """
        curr = self.head
        elements = []
        while curr:
            elements.append(str(curr.data))
            curr = curr.next
        print(" -> ".join(elements))

if __name__ == "__main__":
    # Start with the empty list.
    list = SinglyLinkedList()

    # ******INSERTION******
    # Insert the values
    list.append(1)
    list.append(2)
    list.append(3)
    list.append(4)

    # Print the LinkedList
    list.print_list()