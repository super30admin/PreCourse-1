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
        self.size = 0

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        if self.head == None:
           self.head = ListNode(data,None)

        itrnode = self.head
        while itrnode.next:
              itrnode = itrnode.next

        itrnode.next = ListNode(data,None)   
        self.size += 1
        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if key>=self.size:
           return -1
        else:
           temp = self.head
           for i in range(index):
               temp = temp.next
           return temp.data
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if key==0:
           self.head = self.head.next
           
        else:
           temp = self.head
           prev = self.head

           for i in range(key):
                prev = temp
                temp = temp.next
           prev.next = temp.next

    def print(self):  
        itr = self.head
        list1 = ''
        while itr:
            list1 += str(itr.data)+' -> ' if itr.next else str(itr.data)
            itr = itr.next
        print(list1)

list1 = SinglyLinkedList()
list1.append(1)
list1.append(2)
list1.append(3)
list1.append(4)
list1.append(5)
list1.print()