class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
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
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        if (self.head):
            ptr = self.head
            while(ptr.next):
                ptr = ptr.next
            ptr.next = newNode
        else:
            self.head = newNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if(not self.head):
            return "list is empty"
        ptr = self.head
        while(ptr):
            if ptr.data == key:
                return ptr.data
            ptr = ptr.next
        return "element not found"

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(not self.head):
            return "list is empty"
        
        prev = None
        ptr = self.head

        while (ptr):
            if(ptr.data == key):
                if (prev): 
                    prev.next = ptr.next
                else: # if head node has to be removed
                    self.head = ptr.next
                return "removed"
            prev = ptr
            ptr = ptr.next
        return "cannot remove. element not found"

    def print(self):
        if(not self.head):
            return "list is empty"
        ptr = self.head
        while(ptr):
            print(ptr.data, end = " ")
            ptr = ptr.next
        print("")
        return None


linkedList = SinglyLinkedList()

# print(linkedList.remove(3))

linkedList.append(1)
linkedList.append(2)
linkedList.append(3)
linkedList.append(4)
linkedList.append(5)
linkedList.print()


print(linkedList.find(5))

print(linkedList.remove(3))
linkedList.print()
print(linkedList.remove(5))
linkedList.print()