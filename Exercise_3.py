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
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        while current:
            if current.data == key:
                if previous:
                    previous.next = current.next
                else:
                    self.head = current.next
                return True
            previous = current
            current = current.next
        return False
    
    def display(self):
        """
        Display the elements in the list.
        """
        elements = []
        current = self.head
        while current:
            elements.append(current.data)
            current = current.next
        print("List: ", elements)

if __name__ == "__main__":
    linked_list = SinglyLinkedList()
    linked_list.append(5)
    linked_list.append(15)
    linked_list.append(25)
    linked_list.display()
    print("Finding 2:", linked_list.find(25))
    linked_list.remove(25)
    linked_list.display()
    print("Finding 2:", linked_list.find(25))