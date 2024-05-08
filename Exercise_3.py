
"""
 Time Complexity : 
 append - O(n) since we have to append the element at the end
 find - O(n) worst case since we might not find the element
 remove - O(n) worst case since we might not find the element
 show - O(n) where n is no of elements in list 

 Space Complexity : O(n) except for show where we're using an external list to store elements
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No


 Your code here along with comments explaining your approach : (Note: Added peek & show method for practice)
 1. append method : Creating new node and making it as head if head is empty else traverse until the end and add it to next.
 2. find method : Traversing the head and returning if the key is matching the data.
 3. remove method : Traversing the head and checking it's next element data is matching the key if yes we're linking the current node to it's next next node.
 4. show method : Traversing the whole head and storing each element in list and returning it.
 
 """

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
        new_node = ListNode(data, None)

        if self.head is None:
            self.head = new_node
        else:    
            curr = self.head
            while curr and curr.next is not None:
                curr = curr.next
            curr.next = new_node
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Worst case O(n) time.
        """
        curr = self.head
        while curr is not None and curr.data != key:
            curr = curr.next
        return curr
    
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Worst case O(n) time.
        """
        if not self.head:
            return
        elif self.head.data == key:
            return self.head
        else:
            curr = self.head
            while curr.next:
                if curr.next.data == key:
                    curr.next = curr.next.next
                    return
                curr = curr.next

    def show(self):
        """
        Print the list.
        Takes O(n) time.
        """
        curr = self.head
        result = []
        while curr:
            result.append(curr.data)
            curr = curr.next
        return result

singly_linked_list = SinglyLinkedList()
singly_linked_list.append(1)
singly_linked_list.append(2)
singly_linked_list.append(3)
singly_linked_list.append(4)
singly_linked_list.append(5)

print(singly_linked_list.show())  # 1 -> 2 -> 3 -> 4 -> 5
singly_linked_list.remove(3)
print(singly_linked_list.show())    #  1 -> 2 -> 4 -> 5
print(singly_linked_list.find(2).data)  #  2
print(singly_linked_list.find(6))  # None
