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
        if self.head == None:
            self.head = new_node
        else:
            tail_node = self.head
            while (tail_node.next):
                tail_node = tail_node.next
            tail_node.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current_node = self.head
        while (current_node):
            if current_node.data == key:
                print("Key found")
                return
            else:
                current_node = current_node.next
            print("Key not found")
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print("List is empty")
            return None
        previous_node = None
        current_node = self.head
        while current_node:
            if current_node.data == key:
                if previous_node:
                    previous_node.next = current_node.next
                else:
                    self.head = current_node.next
                print("Key removed")
                return
            previous_node = current_node
            current_node = current_node.next
        print("Key not found")
        return

    def print_linked_list(self):
       current = self.head
       while current:
           print(current.data)
           current = current.next

            
# Driver code
linked_list = SinglyLinkedList()
print(linked_list.append(1))
print(linked_list.append(2))
print(linked_list.append(3))
print(linked_list.append(4))
linked_list.print_linked_list()
print(linked_list.remove(3))
linked_list.print_linked_list()
print(linked_list.append(10))
linked_list.print_linked_list()
print(linked_list.find(4))
linked_list.print_linked_list()

