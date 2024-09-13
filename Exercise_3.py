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
        node = ListNode(data=data)
        if self.head==None:
            self.head = node
        else:
            temp = self.head
            while temp.next!=None:
                temp= temp.next
            temp.next = node
        #self.print()
        #print("------------")
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        temp = self.head
        if temp != None:
            while temp.next != None:
                if temp.data == key:
                    return key
                else:
                    temp = temp.next
            if temp.data == key:
                return key
        return None

        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        #print('haed:',temp.data)
        prev = None
        if temp!= None:

            while temp.next != None:
                if temp.data == key:
                    break
                else:
                    prev = temp
                    temp = temp.next
            if temp.data == key:
                if prev == None:
                    self.head = self.head.next
                    # print('haed:', temp.data)
                else:
                    prev.next = temp.next

        self.print()

    def print(self):
        temp = self.head
        if temp != None:
            while temp.next!=None:
                print("Elements in linked list:",temp.data)
                temp= temp.next
            print("Elements in linked list:",temp.data)


sl = SinglyLinkedList()

sl.append(9)
sl.append(10)
sl.append(2)
sl.append(4)
print(sl.find(2))
print("-----")
print(sl.find(10))
print("------")
print(sl.find(22))
print("------")
sl.remove(4)
print("------")
sl.remove(9)
print("------")
sl.remove(2)
print("------")
sl.remove(10)
print("------")
sl.remove(2)
print("------")