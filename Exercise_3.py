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
        if self.head is None:
            return

        # If the head is the node we want to remove
        if self.head.data == key:
            self.head = self.head.next
            return
        current = self.head
        while current:
            if current.next.data == key:
                current.next = current.next.next
                return
            current = current.next

    def print_list(self):
        current = self.head

        while current:
            print(current.data, end=" -> ")
            current = current.next

        print("None")


# Test
linked_list = SinglyLinkedList()

linked_list.append(10)
linked_list.append(20)
linked_list.append(30)
linked_list.append(40)

print("Original list:")
linked_list.print_list()

print("\nFinding 20:")
node = linked_list.find(20)
print(node.data if node else None)

print("\nRemoving 20:")
linked_list.remove(20)
linked_list.print_list()

print("\nRemoving head (10):")
linked_list.remove(10)
linked_list.print_list()