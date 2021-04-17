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
        new_node = ListNode(data=data)
        if not self.head:
            self.head = new_node
            return

        ptr = self.head
        while ptr.next:
            ptr = ptr.next
        ptr.next = new_node


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr = self.head
        while ptr:
            if ptr.data == key:
                return ptr
            ptr = ptr.next
        return None


    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if not self.head:
            return

        if self.head.data == key:
            temp = self.head
            self.head = self.head.next
            temp.next = None #cleanup
            return

        ptr = self.head
        while ptr.next:
            if ptr.next.data == key:
                temp = ptr.next
                ptr.next = temp.next
                temp.next = None
                break
            ptr = ptr.next

    def printList(self):
        ptr = self.head
        while ptr:
            print(ptr.data, end='->')
            ptr = ptr.next
        print()

mylist = SinglyLinkedList()
mylist.append(1)
mylist.append(2)
mylist.append(3)
n1 = mylist.find(3)
if n1:
    print(n1.data)
else:
    print('Key Not found')
mylist.remove(4)
mylist.remove(3)
n2 =mylist.find(3)
if n2:
    print(n2.data)
else:
    print('Key Not found')
mylist.printList()
