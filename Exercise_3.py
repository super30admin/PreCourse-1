# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No. Could not find the problem
# Any problem you faced while coding this : Faced difficulty while writing a logic for append and find
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        # initilize the data and next attribute
        self.data = data
        self.next = next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        # initializing head with None
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        # creating an object
        next_node = ListNode(data)
        # first node will be head
        # second node will linked to next of the first node
        # third node will linked to next of the second node
        # fourth node will linked to next of the third node
        if self.head:
            # line 32 to 35 will find last node in the linked list
            # can not iterate on head because we don't want to change the head of the linked list
            node = self.head
            # iterating over the node untill we find the last node which will have null in its next
            while node.next:
                # incrementing the node to check the null    
                node = node.next
            # this node is the last node in the linked list. we are linking the new node with this
            node.next = next_node
        else:
            # first node will be the head
            self.head = next_node

        
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            node = self.head
            # iterating over the entire linked list to find the matching key
            while node:
                if node.data == key:
                    return node
                node = node.next
        # if there's nothing in the list and no matching element is found
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        # iterating over the entire linked list to find the matching key
        if self.head:
            node = self.head
            previous_node = None
            # iterating over the entire linked list to find the matching key
            while node:
                # checking key with the list data
                if node.data == key:
                    if previous_node:
                        if node.next:
                            #  we have both previous and next, so we are removing middle element and previous is pointing to next
                            previous_node.next = node.next
                        # when there is no next element the previous node will point to None
                        else:
                            previous_node.next = None
                    else:
                        self.head = node.next
                previous_node = node
                node = node.next
        return None

s_link = SinglyLinkedList()
s_link.append(3)
s_link.append(4)
# s_link.remove(4)
# s_link.remove(3)
# print(s_link.head.next)
print(s_link.find(4))
print(s_link.find(2))
# print(s_link.head)
node = s_link.head
while node:
   print(node)
   node = node.next

