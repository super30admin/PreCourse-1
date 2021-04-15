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
        #create a node and append to the linkedlist
        _node = ListNode(data)
        _node.next = self.head
        # update the start of the linked list
        self.head = _node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # Use a temporary variable to iterate
        temp = self.head
        while(temp):
            # if the key matches the current node's value then return the key
            if key == temp.data:
                return key
            temp = temp.next
        # Will be here if no key is found, so return None
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        # looping over temp.next as we have single linkedlist that does not contain the previous pointer
        while (temp and temp.next):
            if key == temp.next.data:
                # delete the node and point the next of previous node to the curr node's next
                temp.next = temp.next.next
            temp = temp.next
    # Auxiliary method to check the linkedlist
    def printLinkedList(self):
        temp = self.head
        while(temp):
            print (temp.data)
            temp= temp.next


ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
# positive test case
ll.printLinkedList()
print(ll.find(1))
print(ll.find(2))

# negative test case
print(ll.find(3))

# remove
ll.printLinkedList()
ll.remove(1)
ll.printLinkedList()
