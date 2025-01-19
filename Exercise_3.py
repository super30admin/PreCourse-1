'''
Overall:
Time Complexity O(n) [append and find are 0(n)]
Space Complexity O(n)
// Did this code successfully run on Leetcode : Not sure if it exist in LeetCode
// Any problem you faced while coding this : No.
Approach:
straight forward linked list implementation.
have created a _traverseLinkedList funcitont to avoid code duplications.
Optimizations:
we can optimized the appends by including a new tail pointer.
'''
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data  = data
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
        newNode = ListNode(data)
        if self.head:
            tmpNode = self.head
            while tmpNode.next:
                tmpNode = tmpNode.next
            tmpNode.next = newNode
        else:
            self.head = newNode
    
    def _traverseLinkedList(self, findVal):
        """
            Traverse the linked list to find a node with the given data.
            Args:
                findVal: The data to search for in the linked list.
            Returns:
                A tuple containing the previous node and the current node. 
                If the findVal is found in the head node, it returns (None, head).
                If the findVal is not found, it returns (None, None).
        """
        tmpNode = self.head
        prev = None
        while tmpNode:
            if tmpNode.data == findVal:
                return prev, tmpNode
            prev = tmpNode
            tmpNode = tmpNode.next
        
        return None, None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return
        prev, curr = self._traverseLinkedList(key)
        if curr:
            print( f"element {key} found @ {curr}")
            return curr
        print( f'element {key} not found')
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev, curr  = self._traverseLinkedList(key)
        if curr!=None:
            if prev:
                prev.next = curr.next
            else:
                self.head = curr.next
        else:
            print('element not found to remove')

    def printLinkedList(self):
        tmpNode = self.head
        while tmpNode:
            print(tmpNode.data,end='->')
            tmpNode = tmpNode.next
        print(None)

# linked list operations
newList = SinglyLinkedList()
newList.append(10)
newList.append(20)
newList.append(30)
newList.remove(20)
newList.append(40)
newList.append(30)
newList.append(15)
newList.find(30)
newList.find(90)
newList.find(10)
newList.remove(10)
newList.printLinkedList()
newList.find(10)
