# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : n/a
# Any problem you faced while coding this : n/a


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
            return node.data
        while current_node.next is not None:
            current_node = current_node.next
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
        print("Element not found")
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("List is Empty")
            return None
        elif self.head.data == key:
            self.head = self.head.next
            return None
        current_node = self.head

        while current_node.next is not None:
            if current_node.next.data == key:
                current_node.next = current_node.next.next
                return None
            current_node = current_node.next

        print("Element not found")
        return None


'''
# Driver code
ll = SinglyLinkedList()
ll.append(10)
ll.append(20)
ll.append(30)
ll.append(40)
ll.append(50)
ll.append(60)
print(ll.find(30))
print(ll.find(70))
ll.remove(30)
ll.remove(70)
ll.remove(30)
ll.remove(40)
print(ll.find(30))
print(ll.find(40))
print(ll.find(50))
ll.remove(60)
print(ll.find(60))
ll.append(60)
ll.append(70)
print(ll.find(70))
ll.remove(70)
print(ll.find(50))
print(ll.find(60))
print(ll.find(70))
'''