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
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
            return

        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = newNode
        return

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head == None:
            return None

        temp = self.head
        while temp:
            if temp.data == key:
                return temp.data
            else:
                temp = temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        flag = False
        if self.head == None:
            return flag

        current = self.head
        previous = None

        if current.data == key:
            self.head = current.next
            current.next = None
            flag = True
            return flag

        while current:
            if current.data == key:
                previous.next = current.next
                current.next = None
                flag = True
                break
            previous = current
            current = current.next
        if flag is False:
            print(str(key) + " is not in list!")
        else:
            print(str(key) + " deleted!")

        return flag


lst = SinglyLinkedList()
lst.append(1)
print(lst.find(2))
lst.append(2)
print(lst.find(2))
lst.remove(3)
lst.remove(2)
