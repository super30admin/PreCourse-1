# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : took me a little bit to warp my head around singly linked list but i think i get it now


# Your code here along with comments explaining your approach


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
        newNode = ListNode(data)
        if self.head is None:
            self.head = newNode
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = newNode
        return newNode

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current is not None:
            if current.data == key:
                return current
            current = current.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head.data == key:
            self.head = self.head.next
            return

        current = prev = self.head
        while current is not None:
            if current.data == key:
                prev.next = current.next
                return
            else:
                prev = current
            current = current.next


ll = SinglyLinkedList()
while True:
    print("append <value>")
    print("find <value>")
    print("remove <value>")
    print("quit")
    do = input("What would you like to do? ").split()
    operation = do[0].strip().lower()
    if operation == "append":
        ll.append(int(do[1]))
        print("Appended", do[1])
    elif operation == "find":
        result = ll.find(int(do[1]))
        if result is None:
            print("Not found.")
        else:
            print("Found:", result.data)
    elif operation == "remove":
        ll.remove(int(do[1]))
        print("Removed", do[1])
    elif operation == "quit":
        break
