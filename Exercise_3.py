# Time Complexity:
# append: O(n)
# find: O(n)
# remove: O(n)
# Space Complexity: O(n), where n is the number of nodes in the linked list.

class ListNode:
    """
    A node in a singly linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly linked list.
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
            return

        curr = self.head

        while curr.next is not None:
            curr = curr.next

        curr.next = new_node

    def find(self, key):
        """
        Search for the first element with data matching key.
        Return the node or None if not found.
        Takes O(n) time.
        """
        curr = self.head

        while curr is not None:
            if curr.data == key:
                return curr
            curr = curr.next

        return None

    def remove(self, key):
        """
        Remove the first occurrence of key in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return False

        if self.head.data == key:
            self.head = self.head.next
            return True

        curr = self.head

        while curr.next is not None:
            if curr.next.data == key:
                curr.next = curr.next.next
                return True

            curr = curr.next

        return False

    def show(self):
        curr = self.head
        result = []

        while curr is not None:
            result.append(curr.data)
            curr = curr.next

        return result


ll = SinglyLinkedList()
ll.append(10)
ll.append(20)
ll.append(30)

print(ll.show())

node = ll.find(20)
if node is not None:
    print("Found:", node.data)
else:
    print("Not found")

ll.remove(20)
print(ll.show())
