#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : Yes


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
        if self.head == None:
            self.head = ListNode(data,None)
            return
        
        lastNode = self.head
        while lastNode.next:
            lastNode = lastNode.next
        
        lastNode.next = ListNode(data,None)
                
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return True
            curr = curr.next
        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            return
        if self.head.data == key:
            self.head = self.head.next
            return
        
        itr = self.head
        while itr.next:
            if itr.next.data == key:
                itr.next = itr.next.next
                break
            itr = itr.next

#Driver Code
    def print(self):
        if self.head is None:
            print("LL is Empty")
            return
        itr = self.head
        llstr = ''
        while itr:
            llstr += str(itr.data) + '-->' if itr.next else str(itr.data)
            itr = itr.next
        print(llstr)

list1= SinglyLinkedList()
list1.append(1)
list1.append(2)
list1.append(3)
list1.append(4)
list1.append(5)
list1.append(5)
print(list1.find(7))
list1.print()
list1.remove(5)
list1.print()