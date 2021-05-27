"""
Singly Linked List 
    
Time Complexity : All operations take - O(n) except append which takes O(1)
    
Space Complexity : O(n)
    
"""

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
        self.head = self.tail = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        self.tail.next = ListNode(data)
        self.tail = self.tail.next
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head 
        while temp:
            if temp.data == key:
                return temp.data
            temp = temp.next
        return None 
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        if self.head and self.head.data == key:
            self.head = self.head.next
            return 
        
        prev = self.head
        temp = self.head.next
        
        while temp:
            if temp.data == key:
                prev.next = temp.next 
                return 
            prev = temp
            temp = temp.next
        return None
    
    def print_ll(self):
        temp = self.head.next
        while temp:
            print(temp.data, end = " ")
            temp = temp.next            
        print()

def main():
    S = SinglyLinkedList()
    
    for i in range(1,11): S.append(i)
    S.print_ll()
    
    print(S.find(2))
    print(S.find(-1))
    
    S.remove(5)
    S.print_ll()
    
    S.remove(1)
    S.print_ll()
    
    S.remove(10)
    S.print_ll()
    
    S.remove(-1)
    S.print_ll()
    
if __name__ == '__main__': main()
