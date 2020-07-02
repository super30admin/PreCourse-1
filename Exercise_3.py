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
        if self.head is None:
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            print("Stack is empty")
            return
        else:
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
        if self.head is None:
            print("Stack is empty")
            return
        elif self.head.data == key:
            self.head = self.head.next
            return
        else:
            temp = self.head
            while temp.next:
                if temp.next.data == key:
                    break
                temp = temp.next
            if temp.next is not None:
                temp.next = temp.next.next
                return f"item deleted {key}"
            else:
                print("Not Found")


newList = SinglyLinkedList()

newList.append(1)
newList.append(2)
newList.append(3)

print(newList.remove(2))
print(newList.find(3))
