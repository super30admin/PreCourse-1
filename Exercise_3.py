# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Couldn't find on Leetcode
# Any problem you faced while coding this : None


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
        node = ListNode(data)  # the next is set as None by default
        current_node = self.head
        if self.head is None:
            self.head = node
            print("Appended")
            return node.data
        while current_node.next is not None:
            current_node = current_node.next
        print("Appended")
        current_node.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("Empty List")
            return None
        elif self.head.data == key:
            return self.head.data

        current_node = self.head

        while current_node.next is not None:
            current_node = current_node.next  # Because head has already been checked
            if current_node.data == key:
                return current_node.data
        print("Element not found, returning None")
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("Empty List")
            return None
        elif self.head.data == key:
            self.head = self.head.next
            print("Removed")
            return None
        current_node = self.head

        while current_node.next is not None:
            if current_node.next.data == key:
                current_node.next = current_node.next.next
                print("Removed")
                return None
            current_node = current_node.next

        print("Element not found, nothing removed")
        return None


'''
# Driver code
ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
ll.append(4)
ll.append(5)
ll.append(6)
print(ll.find(3))
print(ll.find(7))
ll.remove(3)
ll.remove(7)
ll.remove(3)
ll.remove(4)
print(ll.find(3))
print(ll.find(4))
print(ll.find(5))
ll.remove(6)
print(ll.find(6))
ll.append(6)
ll.append(7)
print(ll.find(7))
ll.remove(7)
print(ll.find(5))
print(ll.find(6))
print(ll.find(7))
'''
