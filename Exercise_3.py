# implementing singly linkedlist
# Time Complexity : O(n) for all functions
# Space Complexity : O(n) for all functions
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : None
# 5(Head) ---> 10 ----> 25 ---> 4 ----> NULL
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
        self.head = None #creating empty linkedlist

    # adding the node at the end of the linked list
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        new_node = ListNode(data)
        if self.head is None:
            self.head = new_node
        else:
            node = self.head
            while node.next is not None:
                node = node.next
            node.next = new_node

    # finding the required node in the linkedlist
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("Linkedlist is empty")
            return
        while self.head is not None:
            if self.head.data == key: #element is found
                return key
            self.head = self.head.next
        return None #element is not found

    # removing the node that matches our key
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        #Checking if linkedlist is empty
        if self.head is None:
            print("Linked List is Empty")
            return
        #checking if the element need to be removed is first node
        elif self.head.data == key:
            self.head = self.head.next
            return
        node = self.head
        while node.next is not None:
            if node.next.data == key: #finding the required node that matches our key
                break
            node = node.next
        if node.next is None:
            print("Node that needs to be removed not found")
        else:
            node.next = node.next.next

    # printing the linkedlist
    def print_ll(self):
        if self.head is None:
            print("Linked List is Empty")

        else:
            node = self.head
            while node is not None:
                print(node.data,"----->",end = " ")
                node = node.next


ll= SinglyLinkedList()
ll.append(5)
ll.append(10)
ll.append(25)
ll.append(4)
ll.remove(10)
ll.print_ll()
search_key = ll.find(25)
print(f"\nThis is the element you are searching for {search_key}")
