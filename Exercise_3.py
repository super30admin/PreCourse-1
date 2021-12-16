# Space Complexity : O(n)
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
            node = self.head
            while node.next is not None:
                node = node.next
            node.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        node = self.head
        while node and (node.data != key):
            node = node.next
        return node

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return

        if self.head.data == key: # when head is the key
            self.head = self.head.next
            return

        node = self.head
        while node.next and (node.next.data != key):
            node = node.next

        if node.next:
            node.next = node.next.next

LL = SinglyLinkedList()

LL.append(3)
LL.append(5)
# LL.append(7)
print("Head is: ", LL.head.data)

element = LL.find(3)
if element:
    print(element.data)
else:
    print("Element not found")

element = LL.find(9)
if element:
    print(element.data)
else:
    print("Element not found")

LL.remove(3)

element = LL.find(3)
if element:
    print(element.data)
else:
    print("Element not found")

LL.append(5)

print("New head is: ", LL.head.data)
