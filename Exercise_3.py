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
        new_node = ListNode(data)

        # if the head is empty
        # assign the head to the new node.
        if not self.head:
            self.head = new_node
            return 

        # assign the new node to the end of the linked list.
        node = self.head    
        while node.next:
            node = node.next
        node.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node:
            if node.data == key:
                return node
            node = node.next
        return None     # return None if the key is not found in the linked list.
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        node = self.head
        if not node:                    # return if the head points to None i.e. the linked list is empty.
            return

        if node.data == key:            # if the head element matches with the key. assign head to the next of the current node.
            self.head = node.next
            return 

        while node.next:
            if node.next.data == key:   # if the value of the node is equal to the key
                node = node.next.next
                return
            node = node.next
            

# Operations on a Singly Linked List.
ll = SinglyLinkedList()
ll.remove(2)
print(ll.find(2))      # should return None
ll.append(2)           # append 2 to the linked list.
ll.append(1)           # append 1 to the linked list.
print(ll.find(2))      # should return the node
ll.remove(2)   
print(ll.find(2))      # should return None
print(ll.head.data)

