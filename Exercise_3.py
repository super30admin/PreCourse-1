"""
Did this code successfully run on Leetcode :
Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
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
        # create new node
        new_node = ListNode(data)

        # check if head is empty
        # if yes, assign new node to head
        if self.head is None:
            self.head = new_node
            return

        # if head is not empty
        # create a reference fo head
        curr = self.head
        # traverse till the last node
        while curr.next is not None:
            curr = curr.next
        # assign new node as the last node
        curr.next = new_node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # create a reference of head
        curr = self.head
        # traverse through the linked list to find the key
        while curr.next is not None:
            if curr.data == key:
                return True
            curr = curr.next
        return False

    # print function to test append, find and remove functions
    def printLL(self):
        """
        Take O(n) time
        """
        # create a reference of head
        tempNode = self.head
        # while at least 1 node is present, print the node
        while(tempNode):
            print(tempNode.data)
            tempNode = tempNode.next

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # check if head is absent
        if self.head is None:
            return None
        # create a reference to head
        curr = self.head

        # if head is equal to key
        if curr.data == key:
            # assign head value to a variable
            temp_node = self.head
            # make head's next as the new head
            self.head = self.head.next
            # delete the old head
            temp_node = None

        # traverse to check to delete key
        while curr.next is not None:
            # traverse to the node previous to the node = key
            if curr.next.data == key:
                # assign node tp delete to a variable
                node_to_del = curr.next
                # update link
                curr.next = curr.next.next
                # delete node
                node_to_del = None
                break
            curr = curr.next


ll = SinglyLinkedList()
ll.append(10)
ll.append(20)
ll.append(30)
ll.append(40)
ll.append(50)
ll.printLL()
print(ll.find(30))
ll.remove(30)
ll.remove(10)
ll.printLL()

