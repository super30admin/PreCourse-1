class ListNode:
    """A node in a singly-linked list."""
    def __init__(self, data):

        self.data = data
        self.next=None
    
class SinglyLinkedList:
    def __init__(self):
        """Create a new singly-linked list.

        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """Insert a new element at the end of the list.

        Takes O(n) time.
        """
        if self.head == None:
            self.head = ListNode(data)
        else:
            iter_node = self.head            
            while (iter_node.next is not None):
                iter_node = iter_node.next
            iter_node.next = ListNode(data)
        
    def find(self, key):
        """Search for the first element with `data` matching `key`.

        Return the element or `None` if not found. Takes O(n) time.
        Takes O(n) time. es O(n) time.
        """
        if self.head == None:
            return None

        iter_node = self.head
        
        element_index = -1

        while (iter_node.next is not None):
            if iter_node.data == key:
                element_index += 1
                break;
            iter_node = iter_node.next
        
        return element_index

    def remove(self, key):
        """Remove the first occurrence of `key` in the list.

        Takes O(n) time. es O(n) time.
        """
        if self.head == None:
            return None
        iter_node = self.head
        if self.head.data == key:
            self.head = self.head.next
            return

        while (iter_node.next is not None):
            if iter_node.next.data == key:
                iter_node.next = iter_node.next.next
                break;
                
            iter_node = iter_node.next
        print(self.head)

linked_list = SinglyLinkedList()
linked_list.append(45)
linked_list.append(51)
linked_list.append(85)
linked_list.remove(85)
print(linked_list.find(45))
print(linked_list)