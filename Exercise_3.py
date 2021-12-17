from typing import List


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
        self.stackTop = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Using stacktop, it can be done in O(1) time.
        """
        newNode = ListNode(data)

        if self.head == None:
            self.head = newNode
            self.stackTop = self.head
            return
        
        self.stackTop.next = newNode
        self.stackTop = self.stackTop.next

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        
        curr = self.head
        while curr != None and curr.data != key:
            curr = curr.next
        
        return None if curr == None else curr.data

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            print("List is Empty!")
            return None
        

        prev = None
        curr = self.head

        while curr != None:
            if curr.data == key:
                if prev == None:
                    self.head = curr.next
                    return
                else:
                    prev.next = curr.next
                    return
            
            prev = curr
            curr = curr.next
        
        print("Key not found in List")
        return None


        
test = SinglyLinkedList()
test.append(1)
test.append(2)
print(test.find(12))
print(test.find(2))
print(test.remove(2))
print(test.find(2))