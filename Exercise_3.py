# // Time Complexity : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None


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
        if self.head == None:
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            temp = self.head
            while temp is not None:
                if temp.data == key:
                    return temp
                temp = temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        elif self.head.data == key:
            self.head = self.head.next
        else:
            temp = self.head
            while temp.next is not None:
                if temp.next.data == key:
                    temp.next = temp.next.next
                temp = temp.next
        return None

    def print(self):
        temp = self.head 
        while temp is not None:
            print(temp.data)
            temp = temp.next


l1 = SinglyLinkedList()
l1.append(10)
l1.append(20)
l1.append(30)
l1.append(40)
l1.print()
temp = l1.find(40)
print("find=",temp.data)
l1.remove(30)
l1.print()
l1.remove(10)
print("After removing head")
l1.print()
l1.remove(20)
l1.remove(40)
print("End")
l1.print()