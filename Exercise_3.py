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
            newNode = ListNode(data)
            newNode.next = self.head
            self.head = newNode


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            curr = self.head
            while(curr):
                if curr.data == key:
                    return key
                curr = curr.next

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head == None:
            return None

        else:
            
            # check if you found `key` at the beginning, if so update the curr pointer
            while self.head == key:
                self.head = self.head.next

            while(self.head and self.head.next):
                if self.head.data == key:
                    #attach the prev node to next node

                self.head = self.head.next

            return self.head



s = SinglyLinkedList()
s.append(10)
print("Appended the data")
s.append(20)
print("Appended the data")
s.append(30)
print("Appended the data")
s.append(40)
print("Appended the data")
k = s.find(30)
print("Found element: ", k)
