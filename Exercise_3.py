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
        if self.head:
            node, prev = self.head, self.head
            while node is not None:
                prev = node
                node = node.next
            prev.next = ListNode(data)
        else:
            self.head = ListNode(data)
        print(f"{data} added.")

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            node = self.head
            while node is not None:
                if node.data == key:
                    return key
                node = node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head:
            if self.head.data == key:
                self.head = self.head.next
                print(f"{key} removed.")
                return key
            else:
                node, prev = self.head, self.head
                while node is not None:
                    if node.data == key:
                        prev.next = node.next
                        print(f"{key} removed.")
                        return key
                    prev = node
                    node = node.next
        print(f"{key} does not exist.")
        return None


if __name__ == "__main__":
    l = SinglyLinkedList()
    l.append(3)
    l.append(4)
    l.append(5)
    print(l.find(4))
    print(l.find(1))
    print(l.remove(4))
    print(l.find(4))
    print(l.remove(1))
