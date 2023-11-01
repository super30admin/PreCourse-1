# Time complexity for all the methods in the above code is O(n) and space complexity is O(1).
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
        newnode = ListNode(data)
        if not self.head:           #if the list is empty then the newnode is the head
            self.head = newnode
        else:
            current = self.head     #traverse till the end of the list and add the newnode
            while current.next:
                current = current.next
            current.next = newnode
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                return current
            current = current.next
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:    #if the list is empty then there is nothing to remove
            return

        if self.head.data == key:   #if key is the head then remove the head and then update the head
            self.head = self.head.next
            return

        current = self.head
        while current.next:
            if current.next.data == key:
                current.next = current.next.next  #update the next pointer to skip
                return
            current = current.next
            
l_l = SinglyLinkedList()
l_l.append(1)
l_l.append(2)
l_l.append(3)
l_l.append(4)

element = l_l.find()
if element:
    print(element.data)
else:
    print("Element not found")
l_l.remove(3)