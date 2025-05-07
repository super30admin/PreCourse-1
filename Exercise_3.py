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
        if not self.head:
            newNode = ListNode(data)
            self.head = newNode
            return self.head
        temp = self.head
        while temp.next:
            temp = temp.next
        newNode = ListNode(data)
        temp.next = newNode
        return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            return None
        temp = self.head
        while temp:
            if temp.data == key:
                return True
            temp = temp.next
        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return None
        
        if self.head.data == key:
            head = head.next
            return head
        
        curr = self.head
        prev = None
        while curr:
            if curr.data == key:
                prev.next = curr.next
                return self.head
            prev = curr
            curr = curr.next
        return None

    def printList(self):
        if not self.head:
            return None
        
        curr = self.head
        while curr:
            print(curr.data)
            curr=curr.next
        print()

mySingleLinkedList = SinglyLinkedList()
mySingleLinkedList.append(10)
mySingleLinkedList.append(20)
mySingleLinkedList.append(30)
mySingleLinkedList.remove(20)
print(mySingleLinkedList.find(20))
mySingleLinkedList.printList()


    
        
