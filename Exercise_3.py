class ListNode:
    """
    A node in a singly-linked list.
    """
    
    def __init__(self, data, next=None):
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
        if self.head == None:
                self.head =  ListNode(data)

        else:
            temp = self.head
            while(temp.next) != None:
                temp = temp.next
            temp.next = ListNode(data)


        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):

        temp = self.head
        while (temp.next != None):
            if (temp.data == key):
                return key
            else:
                temp = temp.next

        return temp.next
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):

        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        if temp is not None:
            if temp.data == key:
                self.head = temp.next
                temp = None
                return
        while (temp is not None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        if temp == None:
            return None
        prev.next = temp.next

        temp = None

