class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
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
        new_node = ListNode(data)
        
        if self.head is None:
            self.head = new_node
            return
        
        current_node = self.head
        while current_node.next is not None:
            current_node = current_node.next
        current_node.next = new_node
        print("Appended ", current_node.data)
        
    
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        
        while current_node.next is not None:
            if current_node.data == key:
                return current_node.data
            else:
                return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current_node = self.head
        
        # check if head data is key
        if current_node is not None:
            if current_node.data == key:
                self.head = current_node.next
                current_node = None
                return
            
        while current_node is not None:
            if current_node.data == key:
                break
            previous_node = current_node
            current_node = current_node.next
            
        if current_node == None:
            print("key not present")
            return
        
        previous_node.next = current_node.next
        current_node = None
    
    def printList(self):
        current_node = self.head
        while current_node is not None:
            print(current_node.data, end = " ")
            current_node = current_node.next
        print(end="\n")
my_linked_list = SinglyLinkedList()
my_linked_list.append(1)
my_linked_list.append(2)
my_linked_list.append(3)
my_linked_list.printList()
print(my_linked_list.find(1))
my_linked_list.remove(5)
my_linked_list.remove(2)
print(my_linked_list.find(2))
my_linked_list.printList()
