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
        self.num_nodes = 0 

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        self.num_nodes += 1
        new_node = ListNode(data)
        if self.head is None: # check if linked list is
            self.head = new_node
            return
        """new_node.next = self.head
        self.head = new_node"""  # inserting at the start 0(1)

        actual_node = self.head
        while actual_node.next is not None:
            actual_node = actual_node.next

        actual_node.next = new_node
      
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        actual_node = self.head

        if self.head is None:
            return 
        
        while actual_node is not None and actual_node.data != key :
            actual_node = actual_node.next
        
        if actual_node is None:
            return None
        else: 
            return actual_node.data
        

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        actual_node = self.head

        if self.head is None:
            return
        
        previous_node = None
        while actual_node is not None and actual_node.data != key :
            previous_node = actual_node
            actual_node = actual_node.next

        if actual_node is None:
            return 
        if previous_node is None:
            self.head = actual_node.next
        else:
            previous_node.next = actual_node.next


if __name__ == '__main__':
    linked_list = SinglyLinkedList()
    linked_list.append(10)
    linked_list.append(100)
    linked_list.append(1000)
    linked_list.append('Adam')
    print( linked_list.find(100))
