"""
Problem: Implement Singly Linked List

Time Complexity:
    * __init__  : O(1)
    * append    : O(1)
    * find      : O(n)
    * remove    : O(n)

Space Complexity:
    * __init__  : O(1)
    * append    : O(1)
    * find      : O(n)
    * remove    : O(n)

Pass on LeetCode: N/A
Problems Occurred: N/A
"""


from typing import List


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
        start = self.head
        if start:
            runner = start
            while runner.next:
                runner = runner.next
            runner.next = ListNode(data)
            self.head = start
        else:
            start = ListNode(data)
        self.head = start

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        start = self.head
        runner = start
        while runner:
            if runner.data == key:
                return runner 
            runner = runner.next
        self.head = start
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        start = self.head
        runner = start
        previous = None
        while runner:
            if runner.data == key:
                if not previous:
                    start = start.next
                else:                    
                    previous.next = runner.next
                break
            previous = runner
            runner = runner.next
        self.head = start
            
def test():

    # Test Append
    print("Testing Append...")
    LL = SinglyLinkedList()
    test_case_1 = [1,2,3,4,5]
    for x in test_case_1:
        LL.append(x)
    while LL.head:
        assert LL.head.data == test_case_1.pop(0)
        LL.head = LL.head.next

    # Test Find
    print("Testing Find...")
    test_case_2 = (1,2,3,4,5)
    for x in test_case_2:
        LL.append(x)
    for x in test_case_2:
        found = LL.find(x)
        assert not not found
    LL = SinglyLinkedList()
    LL.append(3)
    assert LL.find(3)
    assert not LL.find(6)

    # Testing Remove
    print("Testing Remove...")
    test_case_3 = (1,2,3,4,5)
    test_case_3_correct = [1,2,4,5]
    LL = SinglyLinkedList()
    for x in test_case_3:
        LL.append(x)
    LL.remove(3)
    while LL.head:
        assert LL.head.data == test_case_3_correct.pop(0)
        LL.head = LL.head.next

    print("All Passed!")


if __name__=="__main__":
    pass
    # test()