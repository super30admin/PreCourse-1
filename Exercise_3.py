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
        if not self.head:
            self.head = ListNode(data)
        else:
            temp = self.head
            while temp.next is not None:
                temp = temp.next
            temp.next = ListNode(data)

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        while temp.next is not None:
            if temp.data == key:
                return temp.data
            temp = temp.next
        if temp.data == key:
            return temp.data
        else:
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        prev = None
        while temp.next is not None:
            prev = temp
            temp = temp.next
            if temp.data == key:
                prev.next = temp.next
                del temp

    def print(self):
        '''print Function definition. '''
        temp = self.head
        if temp is None:
            print("Stack is Empty.")
            return
        while temp.next is not None:
            print(temp.data, end='->')
            temp = temp.next
        print(temp.data, end='<-HEAD\n')


a = SinglyLinkedList()
a.append(10)
a.append(20)
a.append(30)
a.append(40)
a.append(50)
a.append(60)
a.append(70)
print(a.find(70))
print(a.find(10))
print(a.find(0))
a.append(80)
a.print()
a.remove(60)
a.print()