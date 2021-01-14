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
            node.next = self.head
            self.head = node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        found = False
        if current is None:
            return 'List is empty'
        else:
            while found is False:
                if current.data == key:
                    found = True
                else:
                    current = current.next
            if current is None:
                return None
            return current
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous = None
        current = self.head
        found = False
        if current is None:
            return 'List is empty'
        else:
            while found is False:
                if current.data == key:
                    found = True
                else:
                    previous = current
                    current = current.next
            if current is None:
                return None
            if previous is None:
                self.head = current.next
            else:
                previous.next = current.next
    
    def printList(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next  


        
# Driver code  
if __name__ == '__main__': 
    llist = SinglyLinkedList() 
    llist.append(20) 
    llist.append(4) 
    llist.append(15) 
    llist.append(85)
    
    llist.printList()
    
    llist.remove(4)
    print('After removing 4')
    llist.printList()
    print(llist.find(20))
