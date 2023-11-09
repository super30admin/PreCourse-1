# Implementing a Singly Linked List
# Time complexity:
# append function - O(n)
# find function - O(n)
# remove function - O(n)
# Space complexity: O(n)
# Any problem you faced while coding this: No.

class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
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
        # This line creates a new node with the data as given element. The second component of this nod points to None.
        new_node = ListNode(data)

        # This is the case if the linked list is empty. 
        # If the linked list is empty, we will make the new given node as the head node.
        if not self.head:
            self.head = new_node
            return 

        # This is the case if the linked list is not empty.
        # If the linked list is not empty, we will add the given element at the end of the linked list. 
        ending_node = self.head
        while ending_node.next:
            ending_node = ending_node.next
        ending_node.next = new_node
        return 
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # We will create a pointer and assign it to the head pointer of the linked list.
        current_pointer = self.head
        # We will traverse the linked list as long as the current point reaches the end of the linked list.
        while current_pointer:
            # While traversing, we will check if the current node is equal to the data we are looking to find.
            # If we find the key, we will return the key.
            if current_pointer.data == key:
                return key
            current_pointer = current_pointer.next
        # If the function doesn't return the key before the current pointer reaches the end of the linked list,
        # It means the key is not present in the linked list. 
        # So, we will return None.
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # We will have two cases here to deal.
        # 1. If the node we need to delete is the head of the linked list. 
        # 2. If the node we need to delete is not the head of the linked list.
        
        # 1st case:
        # We will create a new node and assign it to the head of the linked list
        current_node = self.head
        # We will check if the current node is not empty and check if the head node is the one we 
        # Need to delete.
        if current_node and current_node.data == key:
            # we will first change the head of the linked list to next node
            self.head = current_node.next
            # The we will change the previous node to the null node
            current_node = None
            return 

        # 2nd case:
        # The node we need to delete is not the head of the linked list. 
        # We will create a new pointer Previous and will assign to None.
        # We will use this to keep track of the previous node of the node that needs to be deleted.
        previous_pointer = None
        # We will traverse the linked list until we reach the end of the linked list or
        # We find the key in the linked list that needs to be deleted.
        # While we loop, we first assign the previous node to the current node and 
        # the current node to the next node.
        while current_node and current_node.data != key:
            previous_pointer = current_node
            current_node = current_node.next
        # Once we are out of the loop, it would be because we reached the end of the linked list or 
        # we found the key that needs to be deleted.
        # To make sure we did not reach the end and we found the key, we will check if the current node 
        # # did not reach the tail of the linked list.  
        if current_node is None:
            print("The key is not found in the linked list") 
            return
        # Now, we will remove the link of the key that needs to be deleted. We will point the pointer of the 
        # Previous node to the next node of the current node (the node that needs to be deleted.)
        # And we will assign the current pointer to None. So, the node that needs to be deleted 
        # is out of the linked list. 
        previous_pointer.next = current_node.next
        current_node = None
        return 
