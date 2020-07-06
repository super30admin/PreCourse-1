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
        if not self.head:
            self.head = new_node
        else:
            root = self.head
            while root.next is not None:
                root = root.next
            root.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        root = self.head
        while root.data != key:
            root = root.next
            if not root:
                print("Key not found")
                return None
        return root

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            print("The linked list is empty")
            return 
        prev = self.head
        if prev.data == key:
            self.head = self.head.next
            return
        curr = self.head.next
        while curr and curr.data != key:
            curr = curr.next
            prev = prev.next
        if not curr:
            print("Key not found")
            return
        prev.next = curr.next

    def show(self):
        nodes = []
        root = self.head
        while root is not None:
            nodes.append(str(root.data))
            root = root.next
        print("->".join(nodes))


sll = SinglyLinkedList()
sll.append(1)
sll.append(2)
sll.append(3)
sll.find(2)
sll.show()
sll.remove(2)
sll.remove(3)
sll.show()
sll.append(4)
sll.show()
sll.remove(1)
sll.show()