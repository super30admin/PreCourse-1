class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data=data
        self.next=next


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
            node=ListNode(data,None)
            self.head=node
            return
        itr= self.head
        while itr.next:
            itr=itr.next
        itr.next = ListNode(data,None)


    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        itr=self.head
        while itr is not None:
            if itr.data==key:
                return itr.data
            itr=itr.next
        return None



    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        itr=self.head
        if itr is None:
            return

        if itr.data==key:
            self.head=itr.next
            return

        while itr:
            if itr.next.data==key:
                itr.next=itr.next.next
                return
            itr=itr.next



    def print(self):
        if self.head is None:
            print("Linked List is Empty")
            return

        itr = self.head
        llString=''
        while itr:
            llString += str(itr.data) +"->"
            itr=itr.next  #This will the address to the next node
        print(llString)


if __name__ == '__main__':
    ll=SinglyLinkedList()
    ll.append(30)
    ll.print()
    ll.append(11)
    ll.append(23)
    ll.append(24)
    ll.append(98)
    ll.print()
    print(ll.find(11))

    ll.remove(11)
    ll.print()