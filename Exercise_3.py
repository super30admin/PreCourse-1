# Time Complexity: O(n) 
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: NO

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
            self.head = ListNode(data, None)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data, None)
        return "Successfully appended " + str(data)
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp.next is not None:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head.data == key:
            if self.head.next is None:
                self.head.data = None
            else:
                self.head = self.head.next
        temp = self.head
        while temp.next is not None:
            if temp.next.data == key:
                temp.next = temp.next.next
                break
        return "Successfully removed " + str(key)

    def printLL(self):
        temp = self.head
        while temp is not None:
            print(temp.data)
            temp = temp.next

s1 = SinglyLinkedList()
print(s1.append(1))
print(s1.append(2))
print(s1.append(1))
print(s1.append(2))
print(s1.find(1))
print(s1.remove(2))
s1.printLL()