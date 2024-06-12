"""
To append at end of list 
Time Complexity: O(1)
Space Complexity: O(1)

I defined the tail which keeps track of last element

To find and remove 
Time Complexity: O(n)
Space Complexity: O(n)

I used the two pointer technique to remove the element.
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
        self.tail = None 
        self.length = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if not self.head and not self.tail:
            self.head = new_node 
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head 
        for i in range(self.length):
            if temp.data == key:
                return f"Element is available at index {i}"
            temp = temp.next
        return f"No Element found in the list"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if self.length == 0:
            return None
        elif self.length == 1:
            if temp.data == key:
                self.head = None
                self.tail = None
                self.length -= 1
                return f"The element {key} removed at index 0"
        else:
            for i in range(self.length):
                if temp.data == key:
                    prev.next = temp.next
                    temp.next = None 
                    self.length -= 1
                    return f"The element {key} removed at index {i}"
                prev = temp
                temp = temp.next
        return None
    


SL = SinglyLinkedList()
print(SL.remove(1))
SL.append(1)
print(SL.remove(2))
print(SL.remove(1))
SL.append(1)
SL.append(2)
SL.append(3)
SL.append(5)
SL.append(4)
print(SL.remove(3))
print(SL.remove(4))
#SL.append(2)
#SL.append(3)
#SL.append(4)
#print(SL.find(3))
#print(SL.find(4))
#print(SL.find(1))