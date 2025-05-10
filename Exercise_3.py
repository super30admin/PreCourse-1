# Time Complexity : append O(n), find O(n), remove O(n)
# Space Complexity : O(n) where n is number of nodes in the list
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No issues


class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data #the value we store
        self.next = None #pointer to the next node
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None # starting with an empty list

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return

        current = self.head
        while current.next:
            current = current.next

        current.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        current_node = self.head
        while current_node:
            if current_node.data == key:
                return current_node
            current_node = current_node.next

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
        
        prev = self.head
        current = self.head.next

        while current:
            if current.data == key:
                prev.next = current.next
                return
            prev = current
            current = current.next


if __name__ == "__main__":

    s = SinglyLinkedList()
    s.append(10)
    s.append(20)
    s.append(30)

    # find example
    node = s.find(20)
    print("Found", node.data if node else None)  # prints "Found: 20"

    # removing and then printing list contents simply
    s.remove(20)

    values = []
    current = s.head
    while current:
        values.append(current.data)
        current = current.next
    print("After removal:", values )  # prints "After removal: [10, 30]