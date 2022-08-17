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
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = data
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None
        else:
            temp = self.head
            while temp.next != None:
                if temp.data == key:
                    return key
                temp = temp.next
        return None
        
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = prev = self.head
        if temp == None:
            print("Linked List is empty")
        else:
            while temp.next != None:
                if temp.data == key:
                    prev.next = temp.next
                    break
                else:
                    prev = temp
                    temp = temp.next
            else:
                """If last elements needs to remove"""
                prev.next = None

    def displayList(self):
        """
        Display the List elements
        Time Complexity: O(n)
        """
        temp = self.head
        while temp:
            print(temp.data)
            temp = temp.next

LinkedList = SinglyLinkedList()
firstNode = ListNode(1)
secondNode = ListNode(2)
thirdNode = ListNode(3)

LinkedList.head = firstNode
firstNode.next = secondNode
secondNode.next = thirdNode
data = ListNode(4)
LinkedList.append(data)
print("Before Remove")
LinkedList.displayList()
LinkedList.remove(4)
print("After Remove")
LinkedList.displayList()