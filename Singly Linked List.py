class ListNode(object):
    """
    A node in a singly-linked list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    def getData(self):
        return self.data

    def setData(self, data):
        self.data = data

    def getNext(self):
        return self.next

    def setNext(self, newNext):
        self.next = newNext


class SinglyLinkedList(object):

    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def isempty(self):
        return self.head == None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        temp = ListNode(data)
        temp.setNext(self.head)
        self.head = temp

    def size(self):
        current = self.head
        count = 0
        while current != None:
            count = count + 1
            current = current.getNext()
        return count

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        current = self.head
        found = False
        while current != None and not found:
            if current.getData() == key:
                found = True
            else:
                current = current.getNext()
        return found

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None
        found = False
        while not found:
            if current.getData() == key:
                found = True
            else:
                previous = current
                current = current.getNext()

        if previous == None:
            self.head = current.getNext()
        else:
            previous.setNext(current.getNext())

    def getAllData(self):
        current = self.head
        elements = []
        while current:
            elements.append(current.getData())
            current = current.getNext()
        return elements

if __name__ == '__main__':
    myList = SinglyLinkedList()

    print(myList.head)

    myList.append(22)
    myList.append(295)
    myList.append(7)
    myList.append(3)
    myList.append(2)

    print(myList.size())

    print(myList.getAllData())
    myList.remove(2)
    print(myList.getAllData())