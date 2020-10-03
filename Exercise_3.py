class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=None

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
        new = ListNode(data) #create a new node
        if self.head==None: #append at beginning if head is None
            self.head=new
            return
        temp=self.head
        while temp.next:
            temp=temp.next
        temp.next = new

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp=self.head
        while temp:
            if temp.data == key:
                return temp.data
            else:
                temp=temp.next
        return None

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp=self.head
        if temp:
            if temp.data==key: #if head itself is the key
                self.head = temp.next
                del(temp)
                return
        while temp:
            if temp.data==key:
                break
            prev=temp
            temp=temp.next
        if not temp: # if key not present
            return
        prev.next = temp.next
        del(temp)
        return

    def printList(self):
        temp = self.head
        while(temp):
            print (temp.data),
            temp = temp.next



list = SinglyLinkedList()
list.append(1)
list.append(2)
list.append(3)
print(list.find(2))
list.printList()
