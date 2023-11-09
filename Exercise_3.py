# Time Complexity : append -> O(1), find -> O(n), remove -> O(n)
# Space Complexity : 0(n) where n is number of integers pushed (nodes added)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Minor bugs

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
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
        new_node=ListNode(data)
        new_node.next=self.head
        self.head=new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return "List is empty"
        runner=self.head
        while runner is not None:
            if runner.data==key:
                return runner
            else:
                runner=runner.next
        return "Value not found in list"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return "List is empty"
        if self.head.data==key:
            self.head=None
            return
        runner=self.head
        while runner.next is not None:
            if runner.next.data==key:
                runner.next = runner.next.next
                return
            else:
                runner=runner.next
        return "Value not in list"

obj=SinglyLinkedList()
obj.append(2)
obj.append(3)
obj.append(4)

obj.remove(2)
obj.remove(3)
print(obj.find(2))

obj.remove(4)
print(obj.find(4))
print(obj.remove(4))



        
