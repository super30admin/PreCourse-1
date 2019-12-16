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
        if self.head is None:
            self.head = ListNode(data)
        else:
            self.currentNode = self.head
            while self.currentNode.next is not None:
                self.currentNode = self.currentNode.next
            self.currentNode.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        # When the LinkedList is empty, there is nothing to find. Return None
        if self.head is None:
            return None
        # Else, keep traversing node by node until you find the key. Return the node value.
        # If you reach the end of the Linked List without finding the key, return the error message  
        else:
            self.currentNode = self.head
            while self.currentNode is not None:
                if self.currentNode.data == key:
                    return "Element Found: " + str(self.currentNode.data)
                self.currentNode = self.currentNode.next
            return "Element " + str(key) + " is not found"    

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return "Linked List is empty"
        # When the element to be removed is at the head itself    
        elif self.head.data == key:
            self.head = self.head.next
            return "Element " + str(key) + " removed"
        else:
            self.currentNode = self.head
            while self.currentNode.next is not None:
                if self.currentNode.next.data == key:
                    self.removedValue = self.currentNode.next.data
                    self.currentNode.next = self.currentNode.next.next
                    return "Element " + str(self.removedValue) + " removed"
                else:
                    self.currentNode = self.currentNode.next    
            return "Element " + str(key) +" is not found"

    def printLinkedList(self):
        """Print singly linked list"""
        self.currentNode = self.head

        if self.head is not None:
            while self.currentNode is not None:
                print(self.currentNode.data, end=' ')
                self.currentNode = self.currentNode.next
        else:
            return "List is empty"        


singlyLinkedList = SinglyLinkedList()
singlyLinkedList.append(1)
print("\n")
singlyLinkedList.printLinkedList()
print("\n")
print(singlyLinkedList.find(1))
singlyLinkedList.append(2)
singlyLinkedList.append(3)
print("\n")
singlyLinkedList.printLinkedList()
singlyLinkedList.append(4)
singlyLinkedList.append(5)
print("\n")
singlyLinkedList.printLinkedList()
print("\n")
print(singlyLinkedList.remove(4))
singlyLinkedList.printLinkedList()
print("\n")
print(singlyLinkedList.remove(1))
print("\n")
singlyLinkedList.printLinkedList()
print("\n")
print(singlyLinkedList.find(1))
print("\n")
singlyLinkedList.printLinkedList()
print("\n")
print(singlyLinkedList.remove(3))
print("\n")
singlyLinkedList.printLinkedList()
print("\n")
print(singlyLinkedList.remove(5))
print("\n")
singlyLinkedList.printLinkedList()
print("\n")
singlyLinkedList.printLinkedList()
print(singlyLinkedList.find(2))
print(singlyLinkedList.remove(2))
print("\n")
print(singlyLinkedList.printLinkedList())

