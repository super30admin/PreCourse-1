#Time Complexity : O(N)
#Space Complexity : O(N)
#Did this code successfully run on Leetcode : Not Found
#Any problem you faced while coding this : Took a little long time.


#Your code here along with comments explaining your approach

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
        new_node = ListNode(data)
        # check if the singly linked list is empty
        if self.head is None:
            self.head = new_node
        # traverse till the end of the singly linked list and then add new node
        else:
            end_node = self.head
            while end_node.next is not None:
                end_node = end_node.next
            end_node.next = new_node
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        ''' iterate and compare with the key 
        till the last node of the linked list
        if found stop and return True or else
        traverse till the last node
        '''
        current = self.head
        while current is not None:
            if current.data == key:
                return True
            current = current.next
        return False
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        ''' iterate and compare with the key 
        till the last node of the linked list
        if found stop and remove the node
        '''
        if self.head is None:
            print("Linked List in remove is empty")
        else:
            end_node = self.head
            while end_node.next is not None:
                end_node = end_node.next
                end_node.next = None
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def iterate_llist(self):
        ref = self.head
        while ref is not None:
            print(ref.data)
            ref = ref.next

s = SinglyLinkedList()
s.append(10)
s.append(22)
s.append(35)
s.iterate_llist()
s.remove(35)
print(s.find(10))
s.iterate_llist()
