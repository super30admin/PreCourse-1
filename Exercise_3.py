class ListNode:
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.count = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        This method will help uso have O(1) time complexity for appending
        """
        new_node = ListNode(data)
        if self.count == 0:
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.count += 1

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.count == 0:
            return
        else:
            test_node = self.head
            countdown = self.count
            while countdown > 0:
                if test_node.data == key:
                    return test_node
                else:
                    test_node = test_node.next
                    countdown -= 1

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.count == 0:
            return
        else:
            current_node = self.head
            if current_node.data == key:
                self.head = current_node.next
                current_node.next = None
                return
            prev_node = None
            while current_node.data != key:
                prev_node = current_node
                current_node = current_node.next
            prev_node.next = current_node.next
            if current_node == self.tail:
                self.tail = prev_node
