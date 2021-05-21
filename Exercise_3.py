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
        if self.head == None :
            self.head = ListNode(data)
            return self.head
        else :
            newListNode = ListNode(data)
            ll  = self.head
            while ll.next is not None:
                ll = ll.next
            ll.next = newListNode
            return self.head

        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
    # def printEle(self):
    #     iterNode = self.head
    #     while iterNode is not None:
    #         print(iterNode.data)
    #         iterNode = iterNode.next
        
    def find(self, key):
        iterNode = self.head
        while iterNode != None:
            if iterNode.data == key :
                print(True)
                print(iterNode.data)
                return iterNode
            else:
                iterNode = iterNode.next
        if iterNode == None:
            return None
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        
    def remove(self, key):
        headLL = self.head
        if self.head == key:
                removeOccurence = self.head
                self.head = self.head.next
                removeOccurence.next = None
        else:   
            while headLL != None:
                print(headLL.data)
                if headLL.next:
                    if headLL.next.data == key:
                        removeData = headLL.next
                        headLL.next = headLL.next.next
                        removeData.next = None
                        print("removed Element")
                        break
                    else:
                        print("else")
                        headLL = headLL.next
                else:
                    break
        if self.head == None:
            return None
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """

callLL =  SinglyLinkedList()
callLL.append(2)
callLL.append(5)
callLL.append(7)
callLL.append(9)
callLL.append(6)
callLL.remove(5)
callLL.find(7)

