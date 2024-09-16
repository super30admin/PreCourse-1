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
        if self.head is None:
            node  = ListNode(data,None)
            self.head = node
            return
        
        itr = self.head
        while itr.next:
            itr = itr.next
        itr.next = ListNode(data,None)


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        if self.head is None:
            return "Linked List is Empty"
        itr = self.head

        while itr:
            if itr.data == key:
                return True
            itr = itr.next
        return False
        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        key == index
        """
        if(key < 0):
            raise Exception('Key is Not Valid')
        if(key == 0):
            self.head = self.head.next
        count = 0
        itr = self.head

        while itr:
            if count == key - 1:
                itr.next = itr.next.next
                return
            itr = itr.next
            count +=1
    def printLL(self):
        if self.head is None:
            print('Stack Is Empty')
            return
        itr = self.head
        llstr = ''
        while itr:
            llstr += str(itr.data) + '->'
            itr = itr.next
        print(llstr)

if __name__ == '__main__':
    ll = SinglyLinkedList()
    ll.append(10)
    ll.append(20)
    print(ll.find(10))
    ll.printLL()
    ll.remove(0)
    ll.printLL()

