""" The append function handles two cases: 1. The linkedlist is empty. 2. The linkedlist is not empty.
The need for two cases is because the head is initialized to None and if the linkedlist is empty then head needs to be initialized
to a node with the given value as data.
If the linkedlist exists with other nodes then we need to traverse through the linkedlist and then append at the end of it.

The find function traverses through the linkedlist and returns when the element is found.
The remove function handles three cases: 1. The linkedlist is empty. 2. The element to be removed is the head. 3. The element is not the head.
The time complexity is the same for all three function; It takes O(n) time where n is the number of elements in the LinkedList.
The space complexity is O(n) with n being the number of elements in the linkedlist. """

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
        if(self.head==None):
            self.head = ListNode(data,None)
        
        else:
            temp = self.head
            while(temp.next!=None):
                temp = temp.next
            temp.next = ListNode(data,None)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while(temp!=None):
            if(temp.data == key):
                return key
            temp = temp.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head == None):
            return 'Empty LinkedList'
        if(self.head.data == key):
            self.head = self.head.next
            return 'Done'
        prev = self.head
        temp = self.head.next
        while(temp!=None):
            if(temp.data == key):
                prev.next = temp.next
                return 'Done'
            prev = temp
            temp = temp.next
        return 'Key not found'