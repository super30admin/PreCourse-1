# Exercise_3 : Implement Singly Linked List.


class Node:
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
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.tail is None:
            self.head = Node(data)
            self.tail = self.head
        else:
            self.tail.next = Node(data)
            self.tail = self.tail.next

    def display(self):
        current = self.head
        while current is not None:
            print("Current Linked List: ", current.data)
            current = current.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return true if found or false if not found.
        Takes O(n) time.
        """
        if self.tail is None:
            return None
        current = self.head
        while current:
            if current.data == key:
                return True
            current = current.next
        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        current = self.head
        while current:
            if current.data == key:
                if prev:
                    # Exclude the node with key
                    prev.next = current.next
                else:
                    # Remove the 1st node
                    self.head = current.next
                return True

            prev = current
            current = current.next
        return False


# Driver code
single = SinglyLinkedList()
single.append(3)
single.append(5)
single.append(7)
single.display()
print(single.find(3))
print(single.remove(7))
single.display()
