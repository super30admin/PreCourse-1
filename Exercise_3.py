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
        newnode = ListNode(data)
        if self.head is None:
            self.head = newnode
            return True
        lastnode = self.head
        while lastnode.next:
            lastnode = lastnode.next
        lastnode.next = newnode
        return True
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        while current:
            if current.data == key:
                print("found")
                return key
            else:
                current = current.next
        print("Not found")
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous = None
        current = self.head
        while current:
            if current.data == key:
                if previous:
                    previous.next = current.next
                else:
                    self.head = current.next
                print("Removed", key)
                return True
            previous = current
            current = current.next
        print(key, "Not found")
        return;

# # print the linked list

 #   def printLL(self):
 #       current = self.head
 #       while current:
 #           print(current.data)
 #           current = current.next
# # Testing
#myList = SinglyLinkedList()
#print(myList.append(1))
#print(myList.append(2))
#print(myList.append(3))
#print(myList.append(4))
#myList.printLL()
#print(myList.remove(3))
#myList.printLL()
#print(myList.append(10))
#myList.printLL()
#print(myList.find(4))
#myList.printLL()