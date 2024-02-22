# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Yes, it took some time for implementing all the functions

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
        item = ListNode(data)
        #Checks whether the linked list is empty or not
        if self.head is None:
            self.head = item
            return None
        
        #Assigns the first node of linkedlist
        cur_node = self.head

        #Traverses the linkedlist
        while cur_node.next:
            cur_node = cur_node.next

        #Inserts  a new element at the end 
        cur_node.next = item


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        #Assigns the first node to cur_node
        cur_node = self.head

        #Traverses the list and checks every node with key. If found returns the key or returns none
        while cur_node:
            if cur_node.data == key:
                return cur_node.data
            cur_node = cur_node.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        # Previous node is assigned none and cur_node is head
        prev_node = None
        cur_node = self.head

        if self.head == None:
            return None
        
        #If first node has the element
        if self.head.data == key:
            self.head = self.head.next
            return cur_node.data
        
        #Traverses the linkedlist
        while cur_node:
            if cur_node.data == key:
                prev_node.next = cur_node.next
                return cur_node.data
            prev_node = cur_node
            cur_node = cur_node.next
        return None


SinglyLL = SinglyLinkedList()
#This is the same code used in Exercise 2 for testing, modified for Exercise 3
while True:
    print('append')
    print('find')
    print('remove')
    print('quit')
    do = input('What would you like to do? ').split()
   
    operation = do[0].strip().lower()

    if operation == 'append':
        print(int(do[1]))
        SinglyLL.append(int(do[1]))

    elif operation == 'remove':
        rem_element = SinglyLL.remove(int(do[1]))
        print(rem_element)

    elif operation == 'find':
        find_element = SinglyLL.find(int(do[1]))
        if find_element == None:
            print("Key not found")
        else:
            print(find_element)

    elif operation == 'quit':
        break
