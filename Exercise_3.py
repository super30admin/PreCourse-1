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
        if not self.head:
            self.head = ListNode(data=data)
            return
        temp_head = self.head
        while temp_head.next is not None:
            temp_head = temp_head.next
        temp_head.next = ListNode(data=data)
        return

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp_head = self.head
        while temp_head is not None:
            if temp_head.data == key:
                return temp_head.data
            temp_head = temp_head.next
        return None

    def remove(self, key) -> bool:
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
            return True
        temp_head = self.head.next
        prev_head = self.head
        while temp_head is not None:
            if temp_head.data == key:
                prev_head.next = temp_head.next
                return True
            prev_head = temp_head
            temp_head = temp_head.next
        return False

    def show(self):
        temp_head = self.head
        while temp_head is not None:
            print(str(temp_head.data)+" ", end="")
            temp_head = temp_head.next
        print("\n")


if __name__ == "__main__":
    sl = SinglyLinkedList()
    sl.append(1)
    sl.append(2)
    sl.show()
    sl.append(3)
    sl.show()
    sl.remove(2)
    sl.show()

