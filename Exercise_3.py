class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data):
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
        new_node = ListNode(data)

        if (self.head is None):
            self.head = new_node
            return
        else:
            last = self.head
            while (last.next):
                last=last.next
            last.next=new_node



    def printFunction(self):

        temp = self.head
        while (temp):
            print temp.data,
            temp = temp.next

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        element = self.head

        while (element is not None):
            if (element.data == key):
                return element
            elif (element.next != None and element.next.data == key):
                return element.next
            else:
                return 0
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head

        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return

        while (temp is not None):
            if (temp.data == key):
                break
            prev = temp
            temp = temp.next

            if (temp is None):
                return

            prev.next = temp.next
            temp = None

s=SinglyLinkedList()
s.append(10)
s.append(20)
s.append(30)
s.append(40)
s.append(50)
s.printFunction()
print('\n')
s.remove(50)
s.printFunction()
print('\n')
find_n=s.find(10)
print(find_n.data)

