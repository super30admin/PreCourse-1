# Time: append O(n), find O(n), remove O(n). Space: O(n) for n nodes; O(1) extra per operation.

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

        if self.head is None:
            self.head = ListNode(data)
            return

        curr = self.head
        while curr is not None:
            if curr.next is None:
                curr.next = ListNode(data)
                return
            
            curr = curr.next
        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
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
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next
            return

        curr = self.head
        while curr.next is not None:
            if curr.next.data == key:
                curr.next = curr.next.next
                return
            curr = curr.next

def to_list(sll):
    """Walk the list and return its values as a Python list (test helper only)."""
    values = []
    curr = sll.head
    while curr is not None:
        values.append(curr.data)
        curr = curr.next
    return values


def build(values):
    """Make a SinglyLinkedList from a Python list (test helper only)."""
    sll = SinglyLinkedList()
    for v in values:
        sll.append(v)
    return sll


if __name__ == "__main__":
    # --- append ---
    s = SinglyLinkedList()
    assert to_list(s) == []                      # new list is empty
    s.append(1)
    assert to_list(s) == [1]                     # append to empty list sets head
    s.append(2)
    s.append(3)
    assert to_list(s) == [1, 2, 3]               # append keeps order, head unchanged

    # --- find ---
    s = build([7, 3, 9])
    node = s.find(3)
    assert node is not None and node.data == 3   # found: returns the node
    assert s.find(7).data == 7                   # found at head
    assert s.find(9).data == 9                   # found at tail
    assert s.find(4) is None                     # missing key -> None
    assert SinglyLinkedList().find(1) is None    # empty list -> None

    # --- remove ---
    s = build([7, 3, 9]); s.remove(7)
    assert to_list(s) == [3, 9]                  # remove head

    s = build([7, 3, 9]); s.remove(3)
    assert to_list(s) == [7, 9]                  # remove middle

    s = build([7, 3, 9]); s.remove(9)
    assert to_list(s) == [7, 3]                  # remove tail

    s = build([7, 3, 9]); s.remove(4)
    assert to_list(s) == [7, 3, 9]               # missing key: list unchanged

    s = SinglyLinkedList(); s.remove(1)
    assert to_list(s) == []                      # empty list: no crash

    s = build([5]); s.remove(5)
    assert to_list(s) == [] and s.head is None   # only node removed -> empty

    s = build([1, 2, 2, 3]); s.remove(2)
    assert to_list(s) == [1, 2, 3]               # duplicates: only FIRST occurrence removed

    s = build([7, 3, 9]); s.remove(9); s.append(5)
    assert to_list(s) == [7, 3, 5]               # tail link correct after removal

    print("all tests passed")