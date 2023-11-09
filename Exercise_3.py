
#Implement Singly Linked List.
# // Time Complexity : O(n)
# # // Space Complexity : O(n)
# # // Did this code successfully run on Leetcode :
# # // Any problem you faced while coding this : needed to brush up the concepts.

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data= data
        self.next= None
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = node()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        temp = ListNode(data)
        curr = self.head
        while curr.next!= None:
            curr= curr.next
        curr.next = temp

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head == None:
            print("List is empty")
        else:
            current= self.head
            while current is not None:
                if(current.data==key):
                    return key
                else:
                    return None
                current= current.next


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print("List is empty")
        else:
            current= self.head
            while current is not None:
                last_node= current
                current= current.next

                if(current.data==key):
                    last_node.next= current.next
                    return key
