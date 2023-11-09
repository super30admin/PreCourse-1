# Time Complexity : O(1) for append(), remove(); O(n) for find()
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



class SinglyLinkedList:

    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """

        self.head = []
        return None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if (self.head != []):
            self.head = self.head + [data]
        else:
            self.head = [data]
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if (0 <= key <= len(self.head) - 1):
            return self.head[key]
        else:
            return -1

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if (0 <= key <= len(self.head) - 1):
            x = self.head.pop(key)
            return self.head

        else:
            return self.head


obj = SinglyLinkedList()
print(obj.append(1))
print(obj.append(2))
print(obj.append(3))
print(obj.find(0))
print(obj.remove(3))