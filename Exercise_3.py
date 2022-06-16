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
            self.head = ListNode(data)

        last_node = self.head
        while last_node.next:
            last_node = last_node.next
        last_node.next = new_node


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        pointer = self.head
        while pointer:
            if pointer.data == key:
                return key
            pointer = pointer.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        pointer = self.head
        if pointer.data == key:
            self.head = self.head.next
        else:
            while pointer.next is not None:
                if pointer.next.data == key:
                    pointer.next = pointer.next.next
                if pointer.next is not None:
                    pointer = pointer.next

sll = SinglyLinkedList()
sll.append(4)
sll.append(6)
sll.append(8)
sll.append(10)
sll.remove(8)
search_key = sll.find(8)
print(f"\nThis is the element you are searching for {search_key}")
search_key = sll.find(4)
print(f"\nThis is the element you are searching for {search_key}")
search_key = sll.find(10)
print(f"\nThis is the element you are searching for {search_key}")

