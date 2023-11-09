class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

class SinglyLinkedList:
    def __init__(self):
        self.head = None
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """


    def append(self, data):
        temp = self.head
        newNode = ListNode(data)
        if temp is None:
            self.head = newNode
        else:
            while temp.next is not None:
                temp = temp.next
            temp.next = newNode



        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        temp = self.head
        if temp is None:
            return None
        while temp.next is not None:
            if temp.data == key:
                return key
            temp = temp.next
        if temp.data == key:
            return key
        return None
    #O(n) Time complexity

        
    def remove(self, key):
        temp = self.head
        if temp.data == key:
            self.head = temp.next
            temp.next = None
            return
        prev = temp
        curr = temp.next
        while curr.next is not None:
            if curr.data == key:
                prev.next = curr.next
                curr.next = None
                return
            curr = curr.next
            prev = prev.next

        if curr.next == None and curr.data == key:
            prev.next = None
        #O(n) Time complexity

    def traverse(self):
        temp = self.head
        while temp.next is not None:
            print(temp.data, end=" ")
            temp = temp.next
        print(temp.data)
        #O(n) Time complexity
#O(n) space complexity n is size of the linkedlist
sll = SinglyLinkedList()
sll.append(4)
sll.append(5)
sll.append(6)
sll.append(7)
sll.traverse()
print(sll.find(10))
sll.remove(7)
sll.traverse()




