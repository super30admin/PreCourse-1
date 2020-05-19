# Time Complexity : append O(1), because of tail reference
#   find and remove O(n) because of linear traversal, where n is the length of the list
# Space Complexity : O(n) space, where n is the length of the list
# Did this code successfully run on Leetcode : N.A.
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next):
        self.data = data
        self.next = next

class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        # head ref for appending to empty list and removing at head
        self.head = None
        # tail ref for faster append
        self.tail = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # Append takes O(1) time.
        toAdd = ListNode(data, None)
        # if list is Empty, add to head
        if self.head == None:
            self.head = toAdd
            self.tail = toAdd
        # else add to tail
        else:
            self.tail.next = toAdd
            self.tail = toAdd
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        toReturn = None
        # linear traversal and lookup
        curr = self.head
        while not curr == None:
            if curr.data == key:
                toReturn = curr
                break
            curr = curr.next
        return toReturn

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # linear traversal to check the occurrence of key
        curr = self.head
        prev = None
        while not curr == None:
            if curr.data == key:
                break
            prev = curr
            curr = curr.next

        # if element found
        if not curr == None:
            # if element is head of list
            if prev == None:
                self.head = curr.next
            # else change links
            else:
                prev.next = curr.next
                # if elem is tail
                if curr.next == None:
                    self.tail = prev

l = SinglyLinkedList()
for i in range(0,10):
    l.append(i)

print(l.find(6).data)
print(l.find(100))

l.remove(9)
print(l.tail.data)
l.append(10)

l.remove(100)

print(l.head.data)
l.remove(l.head.data)
print(l.head.data)

print("-------")
curr = l.head
while not curr == None:
    print(curr.data)
    curr = curr.next
