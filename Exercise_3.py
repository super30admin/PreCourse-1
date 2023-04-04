class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
        self.data=data
        self.next=None
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
        else:
            current_node = self.head
            while current_node.next is not None:
                current_node = current_node.next
            current_node.next = new_node

    def find(self, key):

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current.next is not None:
            if current.data == key:
                return current
            else:
             current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        if self.head.data == key:
            self.head = self.head.next
            if self.head is None:
                self.tail = None
            return
        curr_node = self.head
        while curr_node.next is not None:
            if curr_node.next.data == key:
                if curr_node.next == self.tail:
                    self.tail = curr_node
                curr_node.next = curr_node.next.next
                return
            curr_node = curr_node.next


linked_list = SinglyLinkedList()
linked_list.append(4)
linked_list.append(3)
linked_list.append(2)
linked_list.append(1)

element = linked_list.find(10)
if element is not None:
    print("Found element with data:", element.data)
else:
    print("Element not found.")

element = linked_list.remove(4)
if element is not None:
    print("Found element with data:", element.data)
else:
    print("Element not found.")