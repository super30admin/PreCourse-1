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
        if self.head is None:
            self.head = ListNode(data)
        else:
            currentNode = self.head
            while currentNode.next is not None:
                currentNode = currentNode.next
            currentNode.next = ListNode(data)

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            currentNode = self.head
            while currentNode is not None:
                if currentNode.data == key:
                    return currentNode.data
                currentNode = currentNode.next
        else:
            print("None")


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.head and self.head.data == key:
            self.head = self.head.next

        elif self.head:
            currentNode = self.head
            while currentNode is not None:
                prev = currentNode
                currentNode = currentNode.next
                if currentNode and currentNode.data == key:
                    prev.next = currentNode.next



myTestList = SinglyLinkedList()
myTestList.append(1)
myTestList.append(2)
myTestList.append(3)
myTestList.append(4)
myTestList.append(5)
myTestList.append(6)
myTestList.remove(4)
myTestList.remove(1)

node = myTestList.head
while node:
    print(node.data)
    node = node.next