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
        if(self.head == None):
            self.head = ListNode(data)
        else:
            ll = self.head
            while(ll.next != None):
                ll = ll.next
            ll.next = ListNode(data)
    
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        ll = self.head
        while(ll != None):
            if(ll.data == key):
                return ll
            ll = ll.next
<<<<<<< HEAD
=======
        print("Element not Found")
>>>>>>> 71ea11da1192a8ec6ff5bb0918c37147a57511d8
        return None
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        if(self.head == None):
            print("LL is empty")
            return None
        ll = self.head
        # first node check
        if(ll.data == key):
            print("Element Removed: " + str(key))
            self.print()
            self.head = self.head.next
            return ll
        while(ll.next != None):
            if(ll.next.data == key):
                removed_node = ll.next
                ll.next = removed_node.next
                removed_node.next = None
                print("Element Removed: " + str(key))
                self.print()
                return removed_node
            ll = ll.next
<<<<<<< HEAD
=======
        print("Element Not Found to remove")
>>>>>>> 71ea11da1192a8ec6ff5bb0918c37147a57511d8
        return None
    
    def print(self):
        ll = self.head
        while(ll != None):
            print(ll.data, end=",")
            ll = ll.next
        print("")

<<<<<<< HEAD


=======
>>>>>>> 71ea11da1192a8ec6ff5bb0918c37147a57511d8
linkedlist =  SinglyLinkedList()
linkedlist.append(1)
linkedlist.append(2)
linkedlist.append(3)
linkedlist.append(4)
print(linkedlist.find(3).data)
linkedlist.remove(3)
linkedlist.remove(4)
linkedlist.remove(1)
linkedlist.remove(7)
<<<<<<< HEAD
linkedlist.print()
=======
linkedlist.print()
>>>>>>> 71ea11da1192a8ec6ff5bb0918c37147a57511d8
