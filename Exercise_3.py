class ListNode:
    """
    A node in a singly-linked list.
    Space complexity: O(len of LL)
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
        newNode = ListNode(data)
        if self.head:
            cur = self.head
            while cur.next!= None:
                cur = cur.next
            cur.next = newNode
        else:
            self.head = newNode


        
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head:
            cur = self.head
            while cur.next!= None:
                if cur.data == key:
                    # print(cur.data,"--")
                    return key
                cur = cur.next
        else:
            return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        temp = self.head
        #head node case check
        if (temp is not None):
            if (temp.data == key):
                self.head = temp.next
                temp = None
                return

        while(temp!=None):
            if temp.data == key:
                break
            prev = temp
            temp = temp.next

        if(temp == None):
            return
        prev.next = temp.next
        temp = None

    def print(self):
        current = self.head
        while(current):
            print(current.data)
            current = current.next

l = SinglyLinkedList()
l.append(1)
l.append(2)
l.append(3)
l.append(4)
l.print()
print("--")
print(l.find(3))# key = , it will return 3, otherwise return None
print("--")
l.remove(3)# output will be 1,2,4
l.print()
