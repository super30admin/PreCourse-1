class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next                 # declaring and initialising the Node
    
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

        new_node = ListNode(data)
        if self.head == None:
            self.head = new_node
        else:                                                # Adding new node to the topmost element in the stack
            pointerNode = self.head
            while pointerNode.next:
                pointerNode = pointerNode.next
            pointerNode.next = new_node


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        pointerNode = self.head
        while pointerNode:
            if key == pointerNode:
                return pointerNode                                   # Returning the Node if its found (key)
            pointerNode = pointerNode.next

        return None



    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        navigateNode = self.head
        prev = None
        while navigateNode:
            if navigateNode.data == key:
                if prev == None:
                    navigateNode = navigateNode.next
                    return                                         # Updating the List to reflect the element removed
                else:
                    prev.next = navigateNode.next
                    return
            prev = navigateNode
            navigateNode = navigateNode.next

