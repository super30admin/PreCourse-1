#Time complexity O(n)

class ListNode:
    """
    A node in a singly-linked list.
    """

    def __init__(self, data, next=None):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, d):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if (self.head == None):

            self.head = ListNode(d)


        else:
            tmp = self.head

            while (tmp.next != None):

                tmp = tmp.next
            newnode = ListNode(d)

            tmp.next = newnode


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        tmp = self.head
        while (tmp.next != None):
            if (tmp.data == key):
                return key
            else:
                tmp = tmp.next

        return tmp.next

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        tmp = self.head
        while tmp.next != None:
           
            if self.head.data == key:
                self.head = tmp.next
                tmp.next = None
            else:
                prev = tmp
                tmp = tmp.next
                if tmp.data == key:
                    prev.next = tmp.next
                    tmp.next = None

    def printll(self):
        tmp = self.head
        while tmp.next != None:
            print(tmp.data)
            tmp=tmp.next


sll = SinglyLinkedList()

sll.append(20)

sll.append(30)

sll.append(40)
sll.append(50)
sll.append(60)
print("inserted singly linkly list is as below")
sll.printll()
print(sll.find(80))
sll.remove(20)
print("After removal, linked list is")
sll.printll()
