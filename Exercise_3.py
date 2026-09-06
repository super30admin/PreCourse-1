"""
Time complexity and space complexity for the following operations on a singly-linked list:

1. Append
    Time complexity: O(n) - we may need to traverse the entire list to find the end.
    Space complexity: O(1) - we only allocate a new node, which does not depend on the current size of the list.

2. Find
    Time complexity: O(n) - we may need to traverse the entire list to find the key.
    Space complexity: O(1) - we do not allocate any additional space that depends on the size of the list.

3. Remove
    Time complexity: O(n) - we may need to traverse the entire list to find the key to remove.
    Space complexity: O(1) - we do not allocate any additional space that depends on the size of the list.

"""


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
        
        Approach: Create a new node with the given data. 
        If the list is empty, set the head to this new node.
        Otherwise, traverse to the end of the list and 
        set the next pointer of the last node to the new node.
        
        """

        new_node = ListNode(data)  # was: Node(data)
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

        Approach: Start from the head and traverse the list,
        checking each node's data against the key. 
        If a match is found, return that node. 
        If the end of the list is reached without finding a match,
        return None.
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

        Approach: Traverse the list while keeping track of the
        previous node. If the current node's data matches the key,
        update the previous node's next pointer to skip the current node.
        If the node to remove is the head, update the head to the next node.
        """
        current = self.head
        previous = None
        while current:
            if current.data == key:
                if previous is None:
                    self.head = current.next
                else:
                    previous.next = current.next
                return
            previous = current
            current = current.next

def run_tests():
    # --- Test append ---
    ll = SinglyLinkedList()
    ll.append(10)
    ll.append(20)
    ll.append(30)

    values = []
    current = ll.head
    while current:
        values.append(current.data)
        current = current.next
    assert values == [10, 20, 30], f"append failed: {values}"
    print("append: OK ->", values)

    # --- Test find (existing) ---
    node = ll.find(20)
    assert node is not None and node.data == 20, "find failed to locate existing key"
    print("find existing: OK -> found", node.data)

    # --- Test find (missing) ---
    node = ll.find(999)
    assert node is None, "find should return None for missing key"
    print("find missing: OK -> None")

    # --- Test remove head ---
    ll.remove(10)
    values = []
    current = ll.head
    while current:
        values.append(current.data)
        current = current.next
    assert values == [20, 30], f"remove head failed: {values}"
    print("remove head: OK ->", values)

    # --- Test remove middle/tail ---
    ll.append(40)
    ll.remove(30)  # now middle-ish
    values = []
    current = ll.head
    while current:
        values.append(current.data)
        current = current.next
    assert values == [20, 40], f"remove middle failed: {values}"
    print("remove middle: OK ->", values)

    # --- Test remove tail ---
    ll.remove(40)
    values = []
    current = ll.head
    while current:
        values.append(current.data)
        current = current.next
    assert values == [20], f"remove tail failed: {values}"
    print("remove tail: OK ->", values)

    # --- Test remove nonexistent key (should not raise, no-op) ---
    ll.remove(999)
    values = []
    current = ll.head
    while current:
        values.append(current.data)
        current = current.next
    assert values == [20], f"remove nonexistent changed list: {values}"
    print("remove nonexistent: OK -> no change", values)

    # --- Test remove last remaining element ---
    ll.remove(20)
    assert ll.head is None, "list should be empty after removing last element"
    print("remove last element: OK -> list is empty")

    # --- Test operations on empty list ---
    assert ll.find(1) is None, "find on empty list should return None"
    ll.remove(1)  # should not raise
    print("empty list operations: OK -> no crash")

    print("\nAll tests passed!")


run_tests()
