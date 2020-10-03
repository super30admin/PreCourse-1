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

        if self.head == None:
            self.head = ListNode(data)
        else:
            root = self.head
            while root.next != None:
                root= root.next
            temp = ListNode(data)
            root.next = temp


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        root = self.head
        while root!=None:
            if root.data == key:
                return root.data
            root = root.next
        return None
            
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = self.head
        root = self.head
        while root!=None:
            if root.data == key:
                prev.next = root.next
                root = prev.next
                return True
            prev = root
            root = root.next
        return None

    def prinS(self):
        root = self.head
        while root:
            print(root.data)
            root = root.next


# Driver code  
if __name__ == '__main__': 
    Slist = SinglyLinkedList()
    Slist.append(10)
    Slist.append(20) 
    Slist.append(30) 
    Slist.append(5) 
    print(Slist.find(10))
    print(Slist.remove(30))
    Slist.prinS()
