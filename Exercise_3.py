from tempfile import tempdir

'''
    Time Complexity:
    append() - O(n) as we are traversing the whole linked list to get the last element
    remove() - O(1) if the element is at the last then we have to traverse the whole linked list to remove the element.
    find() - O(1) as we have to traverse the whole linked list to find the element, if the element is last.
    show() - O(n) as we have to traverse the whole linked list.

    Space Complexity:
    O(n) as there are n elements in the linked list


    '''


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
