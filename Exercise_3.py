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
        #SpaceComplexity: O(1)
        if self.head == None:
            node = ListNode(data)
            self.head = node
        else:
            node = ListNode(data)
            curr = self.head
            while curr.next:
                curr = curr.next
            curr.next = node
            


     
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Spacecomplexity: O(1)
        curr = self.head
        while curr:
            if curr.data == key:
                return curr.data
            curr = curr.next
        return None


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #Space Complexity: O(1)
        curr = self.head
        while curr.next:
            if curr.next.data == key:
                a=curr.next.data
                curr.next = curr.next.next
                return a
            curr = curr.next
        
if __name__ == '__main__':
    singly = SinglyLinkedList()
    singly.append(10)
    singly.append(20)
    singly.append(30)
    print(singly.find(10))
    print(singly.remove(20))
