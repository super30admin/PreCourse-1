from tempfile import tempdir


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
            tmp = self.head
            while(tmp.next != None):
                tmp = tmp.next
            tmp.next = ListNode(data)
            return self.head

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if not self.head:
            print("Empty")
        tmp = self.head
        while tmp != None:
            if tmp.data == key:
                return True
            tmp = tmp.next
        return False

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            print("Empty")
        tmp = self.head

        if (tmp.data == key):
            self.head = tmp.next
            tmp = None
            return

        while(tmp != None):
            if tmp.data == key:
                break
            prev = tmp
            tmp = tmp.next

        if(tmp == None):
            return
        prev.next = tmp.next
        tmp = None

    def show(self):
        if self.head == None:
            print("Empty stack")
        else:
            tmp = self.head

            while(tmp != None):
                print(tmp.data)
                tmp = tmp.next
            return


s = SinglyLinkedList()
s.append(10)
s.append(20)
s.append(30)
s.append(40)
if s.find(10):
    print('Found')
if not s.remove(30):
    print("Key not found")
s.show()
