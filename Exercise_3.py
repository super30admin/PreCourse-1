
#Tirthaj Rikame
class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data, next=None):
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
        if self.head == None:
            self.head = ListNode(data)
            print("Appended ", data)

        else:
            new_data = ListNode(data)
            new_data.next = self.head
            self.head = new_data
            print("Appended ", data)

        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        if self.head == None:
            print("Can't find anytihng, LinkedList is empty")
        else:
            n = self.head
            while n:
                if n.data == key:
                    print("Find successful for", n.data)
                    return
                else:
                    n = n.next
            print("Find Unsuccessful")


        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head == None:
            print("LinkedList is empty, cannot remove")
        else:
            prev = None
            curr = self.head
            while curr:
                if curr.data == key:
                    print("Element Found, removed")
                    prev.next = prev.next.next
                    return
                else:
                    prev = curr
                    curr = curr.next
            print("Element not Found")

        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def display(self):
        if self.head == None:
            print("LinkedList is empty")
        else:
            n = self.head
            while n:
                print(n.data)
                n = n.next


LL = SinglyLinkedList()
LL.append(10)
LL.append(20)
LL.append(30)
LL.append(40)
LL.display()
LL.find(30)