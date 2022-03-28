
class ListNode:

    def __init__(self, data=None, next=None):
        self.head = None

class SinglyLinkedList:
    def __init__(self):
        if self.head = None:
            self.head = ListNode(data)
        else:
            addd = ListNode(data)
            temp = self.head
            while temp.next != None:
                temp = temp.next
            temp.next = addd

    def find(self, key):
  
        iteration = self.head
        while iteration.next is not None:
            if iteration.data == key:
                return iteration
            else:
                iteration = iteration.next
        return None

    def remove(self, key):
        if self.head.data == key:
            self.head = self.head.next
        else:
            iteration = self.head
            while iteration.next is not None:
                if iteration.next.data == key:
                    iteration.next = iter.next.next
                else:
                    iteration = iteration.next