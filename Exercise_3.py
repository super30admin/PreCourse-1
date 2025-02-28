# Time complexity:
# (1) append(): O(n) because we will traverse through the list and add the node at the end of the list,
# (2) find(): O(n) because in the worst case we need to check each node to find the key
# (3) remove(): O(n) because in the worst case we need to traverse through the list to remove node


# Space Complexity: O(n) as we are storing n nodes into the linked list
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
        # Head insertion method: new node is added to the end of the list through traversal
        new_node = ListNode(data)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
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
            if (
                current.data == key
            ):  # searches for the first occurrence of a node with a given key
                return current.data  # returns data if found
            current = current.next
        return None  # Return None if key is not found

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        prev = None

        if not current:
            return  # no element in the list/ empty list

        # remove head Node
        if current.data == key:
            self.head = current.next
            return

        # Traverse and find the node to remove
        while current and current.data != key:
            prev = current
            current = current.next

        if not current:
            return  # key not found

        prev.next = (
            current.next
        )  # remove the node by pointing the prev node to the next node


# # Creating a Singly Linked List
# sll = SinglyLinkedList()
# sll.append(10)
# sll.append(20)
# sll.append(30)

# # Finding an element
# print(sll.find(20))
# print(sll.find(40))

# # Removing an element
# sll.remove(20)
# print(sll.find(20))
