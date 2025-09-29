# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no, but remove() was made much easier by visualizing the LL.

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    """
    Display the node for debugging.
    """
    def display(self):
        if self.data is not None:
            print("node data: ", self.data)
        else:
            print("empty node")
    
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
        newNode = ListNode(data, None)
        if self.head is None:
            self.head = newNode
            return
        lastNode = self.head
        while lastNode.next is not None:
            lastNode = lastNode.next
        lastNode.next = newNode
        
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
        if self.head is None:
            return False
        if self.head.data == key:
            self.head = self.head.next
            return True
        current = self.head
        while current.next is not None:
            if current.next.data == key:
                current.next = current.next.next
                return True
            current = current.next
        return False
        
    def display(self):
        """
        Display the linked list contents for debugging.
        """
        if self.head is None:
            print("List is empty")
            return
            
        elements = []
        current = self.head
        while current is not None:
            elements.append(str(current.data))
            current = current.next
        print("List:", " -> ".join(elements))


# Debugging
ll = SinglyLinkedList()

ll.append(1)
ll.append(2)
ll.append(3)
ll.display()

print("\nFinding element 2:")
found = ll.find(2)
found.display()

print("\nRemoving element 2:")
removed = ll.remove(2)
ll.display()

# Test find after removal
print("\nFinding element 2 after removal:")
found = ll.find(2)
if found:
    found.display()
else:
    print("not found")

# Test remove non-existent element
print("\nTrying to remove element 5 (doesn't exist):")
removed = ll.remove(5)
print(removed)
ll.display()