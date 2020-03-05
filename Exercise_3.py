"""
// Time Complexity : 
    Insertion - O(n)
    Deletion - O(n)
    Search - O(n)
// Space Complexity  - O(n) to create the linked list
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach

Algorithm explanation
Insertion
    - Create the newnode using datapoint
    - If the head is None(first element)
        - Assign head's next to newnode
    - Else
        - Traverse the list till the current node.next is not none(end of list)
        - Assign curr.next = newnode
Deletion
    - Check if the element to be deleted is at the head of the list, point head to head.next
    - Else
        - Use two pointer approach where prev points to None and curr points to head
        - Traverse through the list 
            - If curr.val = val then break
    - If element is not found in the list, curr will point to None, return None
    - Else
        - point prev'next to curr's next and set curr to None
Search
    - Assign curr to head
    - Iterate through list by advancing curr pointer
        - If the val is curr.val, then return val
    - return None
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
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newnode = ListNode(data)
        if not self.head:
            #create the new node using data and add at the head , update the head
            self.head = newnode
            self.head.next = None
        else:
            curr = self.head
            while curr and curr.next:
                curr = curr.next
            curr.next = newnode
            newnode.next = None
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.data == key:
                return key
            curr = curr.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head and self.head.data == key:
            #delete the head element itself
            self.head = self.head.next
            return

        prev,curr = None,self.head

        while curr:
            if curr.data == key:
                break
            prev = curr
            curr = curr.next

        if not curr:
            return none

        # delete this node using prev
        prev.next = curr.next
        curr = None


    def print_list(self):
        curr = self.head
        while curr:
            print(curr.data,end = " ")
            curr = curr.next

s_list = SinglyLinkedList()
s_list.append(4)
s_list.append(5)
s_list.append(6)
s_list.append(8)
s_list.append(2)
s_list.append(1)
print(s_list.find(6))
s_list.remove(6)
s_list.print_list()