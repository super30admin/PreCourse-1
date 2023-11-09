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
        newnode.next = self.head
        self.head = newnode


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        current = self.head
        while current!=None:
         
            if current.data == key:
                return True
            current = current.next
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        while current!=None:

            if current.data == key:
              
                temp.next = current.next
                return "Element removed"

            temp = current
            current = current.next
        return "element not found"


    def printList(self):
        current = self.head
        while current!=None:
            print(current.data)
            current=current.next


newlist = SinglyLinkedList()

newlist.append(1)
newlist.append(2)
newlist.append(3)
newlist.append(4)
newlist.printList()
# print(newlist.find(2))
print(newlist.remove(5))
print("After remove")
newlist.printList()


