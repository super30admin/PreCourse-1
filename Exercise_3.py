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
        new_node = ListNode(data)
        if self.head == None:
            print('LikedList is Empty, will add directly')
            self.head = new_node

        else:
            print('Linkedlist not empty need to add at the end')
            n = self.head
            while n.next != None:
                n = n.next
            n.next = new_node


        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        
    def find(self, key):
        n = self.head
        if key == n.data:
            return print(key,'was found')
        else:
            while key != n.data:
                n = n.next
                if key ==n.data:
                    print(key,'was found')
                elif n.next == None:
                    print('None')

        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        if self.head == None:
            print('Linkedlist is empty, cant remove')
            return
        else:
            n = self.head
            if key == n.data:
                self.head = n.next
                print('key, at the start of Linkedlist is removed')
                return
            else:
                while n.next != None:
                    if key == n.next.data:
                        n.next = n.next.next
                        print('Element was deleted')
                        return
                    else:
                        n = n.next
                print('Element was not found')
                return
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
    def display(self):
        if self.head == None:
            print('LL is empty cant display')
            return
        else:
            n = self.head
            while n != None:
                print(n.data)
                n = n.next
LL = SinglyLinkedList()
LL.append(10)
LL.append(20)
LL.append(30)
LL.append(40)
LL.display()
LL.find(50)