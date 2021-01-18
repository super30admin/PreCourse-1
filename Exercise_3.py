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
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        flag = 0
        cur = self.head
        while cur:
            if cur.data == key:
                flag = 1
                break
            cur = cur.next

        print(f"{cur.data} FOUND") if flag else print(f"{key} NOT FOUND")

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next

        else:
            cur = self.head
            prev = None
            while cur:
                if cur.data == key:
                    prev.next = cur.next
                    break
                else:
                    prev = cur
                    cur = cur.next

    def display(self):
        if not self.head:
            return None
        else:
            cur = self.head
            while cur:
                print(cur.data)
                cur = cur.next


single = SinglyLinkedList()
single.append(1)
single.append(2)
single.append(3)
single.append(4)
single.append(5)
single.display()
