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
        nodeToAppend = ListNode(data)
        if self.head is None:
            self.head = nodeToAppend
            nodeToAppend.next = None
            return

        last = self.head
        
        
        while (last.next != None):
            last = last.next
        last.next = nodeToAppend

        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        if (temp != None):
            if (temp.data == key):
                return key
            else:
                while(temp.next != None):
                    if (temp.data == key):
                        return key
                    temp = temp.next
        else:
            return "None"
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        prev = None
        current = self.head
  
        while (current != None):
            if current.data == key:
                if current == self.head:
                    self.head = self.head.next
                    current = self.head
                else:  
                    prev.next = current.next
                    current = current.next
                return
            else:
                prev = current
                current = current.next
  
        # return head (if key not in list)

    def printSLL(self):
        temp = self.head
        while(temp):
            print(temp.data)
            temp = temp.next
        
sll = SinglyLinkedList()
sll.append(11)
sll.append(22)
sll.append(33)
sll.append(44)
sll.append(33)
sll.append(33)
# sll.printSLL()
sll.remove(33)
# sll.printSLL()
sll.remove(33)
sll.printSLL()
