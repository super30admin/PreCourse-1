#Exercise_3 : Implement Singly Linked List.

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
    #O(n)
    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newNode = ListNode(data)  #[] -> [1 -> None] -> [1 -> None]
        
        if not self.head:
            self.head = newNode
            return 

        end = self.head
        while end.next:
            end = end.next 
        end.next = newNode
    #O(n)
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        curr = self.head 
        while curr:
            if curr.data == key:
                return curr.data

            curr = curr.next 
        return None 
    #O(n)
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        curr = self.head

        #iterate through LL, if we find the key remove and break
        while curr:
            #found key [1,2,3,4,5] if key is 3... [1,2,4,4,5] ... [1,2,4,5]
            if curr.data == key:
                curr.data = curr.next.data 
                curr.next = curr.next.next 
                break 
            
            curr = curr.next 
    #O(n)
    def printLL(self):
        curr = self.head
        while curr:
            print(curr.data)
            curr = curr.next 

if __name__ == '__main__':
    singlyLL = SinglyLinkedList()

    singlyLL.append(10)
    singlyLL.append(20)
    singlyLL.append(30)
    singlyLL.append(40)
    singlyLL.append(50)
    singlyLL.remove(30)
    singlyLL.printLL()