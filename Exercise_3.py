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
        else:
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
        current = self.head
        previous = None

        while current:
            if current.data == key:
                if previous is None:
                    self.head = current.next
                else:
                    previous.next = current.next
                return True  # Element removed
            previous = current
            current = current.next
        return False  

if __name__ == "__main__":
    sll = SinglyLinkedList()

    sll.append(1)
    sll.append(2)
    sll.append(3)

    found_node = sll.find(2)
    if found_node:
        print(f"Found: {found_node.data}")
    else:
        print("Not found.")

    result = sll.remove(2)
    if result:
        print("Element removed.")
    else:
        print("Element not found.")

    found_node = sll.find(2)
    if found_node:
        print(f"Found: {found_node.data}")
    else:
        print("Not found.")
