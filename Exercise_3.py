class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
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
        else:
            n = self.head
            while n.next is not None:
                n = n.next
            n.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        n = self.head
        while n is not None:
            if n.data == key:
                return True
            n = n.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("can't delete LL is empty")
            return
        if key == self.head.data:
            self.head=self.head.next
            return
        n = self.head
        while n.next is not None:
            if x == n.next.data:
                break
            n = n.next
        if n.next is None:
            print("No node")
        else:
            n.next == n.next.next

    def print_LL(self):
        if self.head is None:
            print("Linked list is empty!")
        else:
            n = self.head
            while n is not None:
                print(n.data)
                n = n.next

LL1 = SinglyLinkedList()
LL1.append(10)
LL1.append(20)
LL1.append(30)
LL1.remove(10)
# LL1.remove(20)
print(LL1.find(30))
LL1.print_LL()
