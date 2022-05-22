class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next=None):
        self.data = data
        self.next = next
        
    # defining getter and setter for data and next
    def getData(self):
        return self.data
    
    def setData(self, data):
        self.data = data
    
    def getNextNode(self):
        return self.next
    
    def setNextNode(self, node):
        self.next = node
    
class SinglyLinkedList:
    def __init__(self, head=None):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = head

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        node = ListNode(data, self.head)
        self.head = node
        return True
    
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head
        while curr:
            if curr.getData() == key:
                return True
            else:
                curr = curr.getNextNode()
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        curr = self.head
        while curr:
            if curr.getData() == key:
                if prev:
                    prev.setNextNode(curr.getNextNode())
                else:
                    self.head = curr.getNextNode()
                return True
            
            prev = curr
            curr = curr.getNextNode()
            
        return False
    
    # print the linked list
    def show(self):
        curr = self.head
        while curr:
            print(curr.data)
            curr = curr.getNextNode()
    
mySinglyLinkedList = SinglyLinkedList()
print("Inserting")
print(mySinglyLinkedList.append(5))
print(mySinglyLinkedList.append(15))
print(mySinglyLinkedList.append(25))

mySinglyLinkedList.show()

print(mySinglyLinkedList.find(25))

print(mySinglyLinkedList.remove(25))

mySinglyLinkedList.show()

