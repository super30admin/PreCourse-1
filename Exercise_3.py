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
        self.head = ListNode()

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)
        temp = self.head
        while temp.next != None:
            temp = temp.next
        
        temp.next = newNode

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head

        while temp.next:
            if temp.next.data == key:
                return temp.next
            else:
                temp = temp.next
        
        return None
    

    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        previous = self.head

        while previous.next:
            if previous.next.data == key:
                break
            else:
                previous = previous.next

        # if we didn't find the key, previous will be TAIL, and previous.next will be None
        # else previous.next will be the item to remove
        if previous.next:
            itemToRemove = previous.next
            previous.next = itemToRemove.next
            itemToRemove.next = None


ll = SinglyLinkedList()
ll.append(1)
ll.append(2)
ll.append(3)
print((ll.find(2)).data)
print(ll.find(5))
ll.remove(2)
print(ll.find(2))