# Time Complexity : 0(n) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : No

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
        else:
            curr_head = self.head
            while curr_head.next is not None:
                curr_head = curr_head.next
            curr_head.next = new_node

            
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmp = self.head
        while (tmp.next is not None):
            if (tmp.data == key):
                return key
            else:
                tmp = tmp.next

        return tmp.next
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr_node = self.head
        while(curr_node.next is not None):
            if (curr_node.data == key):
                self.head = curr_node.next 
                curr_node.next = None
            else: 
                first_node = curr_node
                curr_node = curr_node.next
                if curr_node.data == key:
                    first_node.next = curr_node.next
                    curr_node.next = None
    
    def printList(self):
        tmp = self.head
        while tmp:
            print(tmp.data)
            tmp=tmp.next
        return None


list = SinglyLinkedList()

list.append(1)
list.append(2)
list.append(3)
list.append(4)
list.append(5)
print('Inserted List')
list.printList()
print(list.find(1))
print(list.find(7))
list.remove(1)
list.remove(7)
print('Updated List')
list.printList()