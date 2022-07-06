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

        :return: None
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.

        :return: None
        """
        node = ListNode(data)
        if self.head is None:
            self.head = node

        # Creating a Temporary Node

        temp = self.head
        while temp.next is not None:
            temp = temp.next
        temp.next = node

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """

        if self.head is None:
            return None

        temp = self.head

        while temp is not None:
            if temp.data == key:
                return temp
            temp = temp.next

        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

        if self.head is None:
            return "Linked List has 0 Elements"

        elif self.head.data == key:
            self.head = self.head.next

        else:
            temp = self.head
            while temp.next is not None:

                if temp.next.data == key:
                    temp.next = temp.next.next
                    return "Element was found and removed"
                else:
                    temp = temp.next

    def print(self):
        temp = self.head

        while temp is not None:
            print("| {} | - >".format(temp.data))
            temp = temp.next
        print("\n")


LL = SinglyLinkedList()
LL.head = ListNode(10)
LL.append(100)
LL.append(80)
LL.append(8220)
LL.append(80)
LL.print()
LL.remove(80)
LL.print()
LL.append(900)
LL.print()
LL.remove(100)
LL.print()
