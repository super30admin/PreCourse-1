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
        NewNode = ListNode(data)
        if self.head is None:
            self.head = NewNode
            return
        else:
            LastElement = self.head
            while (LastElement.next):
                LastElement = LastElement.next
            LastElement.next = NewNode
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        element = self.head
        if element.data == key:
            return print(str(element.data) +' was found')
        else:
            while element is not None:
                element = element.next
                if element.data == key:
                    return print(str(element.data) +' was found')
        return print(str(key) +'was not found')
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        element = self.head

        if element is None:
            return print('List is empty')

        if element is not None:
            if element.data == key:
                self.head = element.next
                element = None
                return print(str(key) + ' deleted')

        while element is not None:
            if element.data == key:
                break
            previousElement = element
            element = element.next

        previousElement.next = element.next
        print(str(key) + ' is deletd from list')
        element = None

    def display(self):
        if self.head == None:
            print('List is empty')
            return
        else:
            n = self.head
            while n != None:
                print(n.data)
                n = n.next

LL = SinglyLinkedList()
LL.append(10)
LL.append(20)
LL.append(30)
LL.append(40)
LL.display()
LL.remove(10)
LL.display()
LL.find(30)