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
        if self.head is None:
            self.head = new_node
            
        else:
            prev_node = None
            current_node = self.head
            while current_node is not None:
                prev_node     = current_node
                current_node  = current_node.next
            prev_node.next = new_node
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        current_node = self.head
        while current_node:
            if current_node.data == key:
                return key
            else:
                current_node = current_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return None
        
        current_node = self.head

        if current_node.data == key:
            self.head = current_node.next
            return None
        prev_node = current_node
        current_node = current_node.next
        while current_node:
            if current_node.data == key:
                prev_node.next = current_node.next
                return None
            else:
                prev_node = current_node
                current_node = current_node.next

    def printLL(self):
        current_node = self.head
        LL = []
        while current_node:
            LL.append(current_node.data)
            current_node = current_node.next
        return print(LL)

 
myL = SinglyLinkedList()
myL.append('a')
myL.append('b')
myL.append('c')
myL.append('d')
print(myL.find('d'))
print(myL.find(1))
myL.printLL()
myL.remove('b')
myL.printLL()
myL.remove('a')
myL.printLL()
myL.remove('d')
myL.printLL()