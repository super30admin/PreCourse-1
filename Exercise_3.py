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

        if self.head is None:
            self.head = ListNode(data)
            return
        else:
            new_node = ListNode(data)
            tmp_node = self.head
            while tmp_node.next is not None:
                tmp_node = tmp_node.next
            tmp_node.next = new_node

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        new_node = self.head
        while new_node.next is not None:
            if new_node.data == key:
                return new_node.data
            else:
                new_node = new_node.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return None

        new_node = self.head

        if new_node.data == key:
            self.head = new_node.next

        while new_node.next is not None:
            if new_node.next.data == key:
                new_node.next = new_node.next.next
                break
            new_node = new_node.next

    def print_list(self):
        if self.head is None:
            return None
        new_node = self.head
        while new_node:
            print(new_node.data,end="")
            new_node = new_node.next

        print("\n",end="")



ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.print_list()
ll.find(1)
ll.print_list()
ll.find(2)
ll.print_list()
ll.find(3)
ll.print_list()
ll.remove(1)
ll.print_list()
ll.remove(3)
ll.print_list()
