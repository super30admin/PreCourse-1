# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

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
        else:
            temp = self.head
            while(temp.next is not None):
                temp = temp.next
            newNode = ListNode(data)
            temp.next = newNode    
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        else:
            temp = self.head
            while(temp is not None):
                if temp.data == key:
                    return temp.data
                temp = temp.next
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return None
        temp = self.head    
        if temp.data == key:
            self.head = temp.next
            temp.next = None 
            return "Node deleted successfully"
        else:
            while(temp is not None):
                if temp.data == key:
                    temp.next = temp.next.next
                    return "Node deleted successfully"
                temp = temp.next
        return "Node with given key not found"    

obj1 = SinglyLinkedList()
obj1.append(1)
obj1.append(2)
obj1.append(3)
obj1.append(4)
obj1.append(5)
print(obj1.find(2))
print(obj1.find(6))
print(obj1.remove(3))
print(obj1.remove(6))