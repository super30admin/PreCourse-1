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
            newNode = ListNode(data)
            self.head = newNode
        else:
            last = self.head
            while last.next != None:
                last = last.next
            last.next = ListNode(data)
        print(f"Appended {data} to the list.")

    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        last = self.head
        while(last != None):
            if last.data == key :
                print(f"Found {key} in the list.")
                return self
            last = last.next
        print(f"{key} not found in the list.")
        return None
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        current = self.head
        previous = None

        while current!=None:
            if current.data == key:
                if previous==None:
                    previous.next = current.next
                else:
                    self.head = current.next
                print(f"Removed {key} from the list.")
                return current
            previous = current
            current = current.next
        print(f"{key} not found in the list.")
        return None

alinkedlist = SinglyLinkedList()
alinkedlist.append(8)
alinkedlist.append(7)
alinkedlist.append(6)
alinkedlist.append(1)
alinkedlist.find(6)
alinkedlist.remove(1)