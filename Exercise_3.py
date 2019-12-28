
// Time Complexity : append() - O(n), find() - O(n), remove() - O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Didn't run the code in leet code. As it is not available in leetcode
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

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
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
            return
        
        n = self.head
        while n.next is not None:
            n = n.next
        n.next = new_node
            
            
            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("List has no Elements")
            return
        n = self.head
        while n is not None:
            if n.data == key:
                print("Item Found")
                return True
            n = n.next
        print("Item not found")
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head is None:
            print("The list has no elements")
            return
        
        if self.head.data == key:
            self.head = self.head.next
            return
        
        n = self.head
        while n is not None:
            if n.next.data == key:
                break
            n = n.next
            
        if n is None:
            print("Element not found")
            return
        else:
            n.next = n.next.next
            
        
obj = SinglyLinkedList()
obj.append(10)  
obj.append(11)
obj.append(12)
print(obj.find(11))
print(obj.remove(11))

        
        
        
        
