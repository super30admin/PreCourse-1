class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None
        self.length=0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head != None:
            self.head=ListNode(data,self.head)
        else:
            self.head=ListNode(data)
        self.length += 1

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ptr=self.head
        while True:
            if ptr.data == key:
                return ptr.data
            else:
                if ptr.next != None:
                    ptr=ptr.next
                else:
                    return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if self.length != 0:
            current =self.head
            prev = None
            while True:
                if current.data == key or current == None:
                    break
                else:
                    prev = current
                    current = current.next

            if current == None:
                print('value not found')
            if prev == None:
                self.head = current.next
                self.length -= 1
            else:
                prev.next = current.next
                self.length -= 1

        else:
            print('empty list')


    def show(self):
        ptr=self.head
        while True:
            print(ptr.data)
            if ptr.next != None:
                ptr=ptr.next
            else:
                break


a=SinglyLinkedList()
a.append(2)
a.append(4)
a.append(6)
a.append(8)
a.append(10)
a.append(12)
a.append(14)
print('find 6',a.find(6))
print('find 7',a.find(7))
a.remove(10)
a.show()
